package com.raunaqpahwa;
import java.util.List;
public class Triangle {
	private List<Point> points;
	public List<Point> getPoints() {
		return points;
	}
	public void setPoints(List<Point> points) {
		this.points = points;
	}
	public void draw() {
		for (Point point: points) {
			System.out.format("Point (%d, %d)", point.getX(), point.getY());
		}
	}
}
