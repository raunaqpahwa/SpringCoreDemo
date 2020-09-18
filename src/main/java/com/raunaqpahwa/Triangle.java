package com.raunaqpahwa;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Triangle implements InitializingBean, DisposableBean, ApplicationContextAware, BeanNameAware {
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	public Point getPointA() {
		return pointA;
	}
	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}
	public Point getPointB() {
		return pointB;
	}
	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}
	public Point getPointC() {
		return pointC;
	}
	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}
	public void draw() {
		System.out.format("Point A: (%d, %d) \n", getPointA().getX(), getPointA().getY());
		System.out.format("Point B: (%d, %d) \n", getPointB().getX(), getPointB().getY());
		System.out.format("Point C: (%d, %d) \n", getPointC().getX(), getPointC().getY());
	}
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		this.context = context;
	}
	public void setBeanName(String beanName) {
		System.out.println("Bean Name is: " + beanName);
	}
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initialising bean init method called for triangle");
		
	}
	public void destroy() throws Exception {
		System.out.println("Disposable bean destroy method called for triangle");
	}
	public void myInit() {
		System.out.println("The init method called for triangle");
	}
	public void myCleanUp() {
		System.out.println("The destroy method called for triangle");
	}
}
