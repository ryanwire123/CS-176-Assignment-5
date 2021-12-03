package cs176.polymorphism;

public class Cuboid extends Rectangle implements Solid, Comparable{
	private int h;
	private int z;
	
	Cuboid(int x, int y, int z, int l, int w, int h) {
		super(x, y, l, w);
		this.h = h;
		this.z = z;
	}
	
	public double getArea() {
		return 2 *(getL()*getW() + getL()*h + getW()*h);
	}
	
	public double getVolume() {
		return getL() * getW() * h;
	}
	
	public String toString() {
		String s = this.getClass().toString();
		s = s + ": " + this.getX() +", " + this.getY() + ", " + this.getL() + ", " + this.getW() +", " + this.h +", " + this.z +  ";";
		return s;
	}
	
	public boolean equals(Object obj) {
		if (super.equals(obj) == false){
			return false;
		}
		
		if(obj instanceof Cuboid) {
			Cuboid other = (Cuboid) obj;
			if(this.h == other.h && this.z == other.z) {
				return true;
			} else {
				return false;
			}
		}else {
			return false;
			}
	}
		public int compareTo(Object obj) {
			if(obj instanceof Cuboid) {
				Cuboid other = (Cuboid) obj;
				if(this.getVolume() < other.getVolume()) { 
					return -1;
				} else if (this.getVolume() > other.getVolume()) {
					return 1;
				}else {
					return 0;	
				}	
			}
			return 0;
	}
}

