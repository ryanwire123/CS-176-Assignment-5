package cs176.polymorphism;

public class Circle implements Shape, Comparable, Moveable {
	private int x;
	private int y;
	private int r;
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	
	public double getArea() {
		return Math.PI * Math.pow(r,  2);
	}
	
	public String toString() {
		String s = this.getClass().toString();
		s = s + ": " + this.x +", " + this.y + ", " + this.r +";";
		return s;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Circle) {
			Circle other = (Circle) obj;
			if(this.x == other.x && this.y == other.y && this.r == other.r) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}	
	}
	public int compareTo(Object obj) {
		if(obj instanceof Circle) {
			Circle other = (Circle) obj;
			if(this.getR() < other.getR()) { 
				return -1;
			} else if (this.getR() > other.getR()) {
				return 1;
			}else {
				return 0;	
			}	
		}
		return 0;
	}
	public void move(double deltax, double deltay) {			double newX;
		double newY;
		newX = this.x + deltax;
		newY = this.y + deltay;
		this.x = (int) newX;
		this.y = (int) newY;
	}
}
