package net.takengo.app.entity.location;

/**
 * Geographical coordinate of an object
 * @author admin
 *
 */
public class Coordinates {
	private double x;
	
	private double y;
	
	public Coordinates(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
}
