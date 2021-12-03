package cs176.polymorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ShapeTest {

	public static void main(String[] args) {
	/*	Shape[] shapes = new Shape[6];
		
		Circle c1 = new Circle(0, 1, 2);
		shapes[0] = c1;
		
		Circle c2 = new Circle(1, 2, 2);
		shapes[1] = c2;
		
		Rectangle r1 = new Rectangle(5, 10, 20, 10);
		shapes[2] = r1;
		
		Triangle t1 = new Triangle (3, 4, 5);
		shapes[3] = t1;
		
		Sphere s1 = new Sphere (1, 1, 1, 4);
		shapes[4] = s1;
		
		Cuboid cu1 = new Cuboid (0, 5, 10, 10, 5, 4);
		shapes[5] = cu1;
		
		System.out.println(Arrays.toString(shapes));
		
		System.out.println("=================================");
		for(Shape s : shapes) {
			System.out.println(s);
			System.out.println(s.getArea());
		}
		System.out.println("=================================");
		
		System.out.println("Sphere Volume: ");
		System.out.println(s1.getVolume());
		System.out.println("Cuboid Volume: ");
		System.out.println(cu1.getVolume());
		
		
		System.out.println("c1 == c2? : " + c1.equals(c2));
		c1.setX(1);
		c1.setY(2);
		System.out.println("c1 == c2? : " + c1.equals(c2));
		
		r1.setW(15);
		System.out.println(r1.getArea());
		System.out.println("=================================");
		
		ArrayList<Solid> solids = new ArrayList<>();
		solids.add(s1);
		solids.add(cu1);
		for(Solid s : solids) {
			System.out.println(s);
			System.out.println(s.getArea());
			System.out.println(s.getVolume());
		}
		System.out.println("=================================");
		
		Sphere s2 = new Sphere (1, 1, 1, 3);
		Sphere s3 = new Sphere (1, 1, 1, 10);
		Sphere s4 = new Sphere (1, 1, 1, 1);
		
		solids.add(s2);
		solids.add(s3);
		solids.add(s4);
		
		Cuboid cu2 = new Cuboid (0, 5, 10, 10, 15, 4);
		Cuboid cu3 = new Cuboid (0, 5, 10, 1, 2, 4);
		Cuboid cu4 = new Cuboid (0, 5, 10, 8, 5, 2);
		
		solids.add(cu2);
		solids.add(cu3);
		solids.add(cu4);

		System.out.println("=================================");
		System.out.println("Before sort: ");
		for(Solid s : solids) {
			System.out.println(s);
			System.out.printf("A: %.2f\n" , s.getArea());
			System.out.printf("V: %.2f\n" , s.getVolume());
		}
		System.out.println("=================================");
		
		Collections.sort(solids, new CompareByVolume());
		System.out.println("=================================");
		System.out.println("After sort by Volume: ");
		for(Solid s : solids) {
			System.out.println(s);
			System.out.printf("A: %.2f\n" , s.getArea());
			System.out.printf("V: %.2f\n" , s.getVolume());
		}
		System.out.println("=================================");
		Collections.sort(solids, new CompareByArea());
		System.out.println("=================================");
		System.out.println("After sort by Area: ");
		for(Solid s : solids) {
			System.out.println(s);
			System.out.printf("A: %.2f\n" , s.getArea());
			System.out.printf("V: %.2f\n" , s.getVolume());
		}*/
		System.out.println("=================================");
		
		Circle[] circles = new Circle[3];
		
		Circle cir1 = new Circle(0, 1, 2);
		circles[0] = cir1;
		
		Circle cir2 = new Circle(3, 2, 4);
		circles[1] = cir2;
		
		Circle cir3 = new Circle(4, 5, 1);
		circles[2] = cir3;
		
		Arrays.sort(circles);
		System.out.println(Arrays.toString(circles));
		System.out.println("=================================");

		
		Rectangle[] recs = new Rectangle[3];
		
		Rectangle rex1 = new Rectangle(5, 10, 20, 3);
		recs[0] = rex1;
		
		Rectangle rex2 = new Rectangle(4, 8, 5, 2);
		recs[1] = rex2;
		
		Rectangle rex3 = new Rectangle(6, 9, 8, 10);
		recs[2] = rex3;
		
		Arrays.sort(recs);
		System.out.println(Arrays.toString(recs));
		System.out.println("=================================");
		
		cir1.move(3, 1);
		System.out.println(cir1);
		System.out.println("=================================");

		
		rex2.move(2, 3);
		System.out.println(rex2);
		System.out.println("=================================");

		
		Cuboid cub1 = new Cuboid (5, 10, 2, 20, 3, 2);
		Cuboid cub2 = new Cuboid (4, 8, 6, 5, 2, 10);
		
		System.out.println(cub1.compareTo(cub2));

		
		
		
		

	}

}
