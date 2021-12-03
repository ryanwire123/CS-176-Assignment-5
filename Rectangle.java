package cs176.polymorphism;

public class Rectangle implements Shape, Comparable, Moveable {
	private int x;
	private int y;
	private int l;
	private int w;
	
	
	Rectangle(int x, int y, int l, int w){
		this.x = x;
		this.y = y;
		this.l = l;
		this.w = w;
	}
	public int getL() {
		return l;
	}
	public void setL(int l) {
		this.l = l;
	}
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
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
	public double getArea() {
		return l * w;
	}
	
	public String toString() {
		String s = this.getClass().toString();
		s = s + ": " + this.x +", " + this.y + ", " + this.l + ", " + this.w + ";";
		return s;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			if(
				this.l == other.l &&
				this.w == other.w &&
				this.x == other.x &&
				this.y == other.y 
					 ) {
				return true;
			}else {
				return false;
			}
		} else {
			return false;
		}
	}
	public int compareTo(Object obj) {
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle) obj;
			if(this.getArea() < other.getArea()) { 
				return -1;
			} else if (this.getArea() > other.getArea()) {
				return 1;
			}else {
				return 0;	
			}	
		}
		return 0;
	}
	public void move(double deltax, double deltay) {
		double newX;
		double newY;
		newX = this.x + deltax;
		newY = this.y + deltay;
		this.x = (int) newX;
		this.y = (int) newY;
	}
	
}
