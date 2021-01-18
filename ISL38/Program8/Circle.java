/*
Create a Circle class with following members.
A data member that stores the radius of a circle.
A constructor function with an argument that initializes the radius A function that computes and returns area of a circle
Create two derived classes Sector and Segment that inherit the Circle class. Both classes inherit radius and the function that returns the circle’s area from Circle.
In addition to the members inherited from Circle, Sector and Segment have some specific members as follows:
Sector
1. A data member that stores the control angle of a sector (in radians)
2. A constructor function with arguments that initialize radius and angle
3. A function that computes and returns the area of a sector
Segment
1. A data member that stores the length of a segment in a circle
2. A constructor function with arguments that initialize radius and length
3. A function that computes and returns the area of a segment
Create the main () function to instantiate an object of each class and then call appropriate member functions to compute and return the area of a circle, sector and segment.
Note :Area_of_circle = pi * r 2
Area_of_Sector=(1/2) r 2 *θ
Area_of_segment= r2 *((r-h)/r) – (r-h) (2rh-h2)1/2 Where r is the radius of a circle, θ is the central angle of a sector in radians, h is the length of a segment and ((r-h)/r) is in radians.
*/

import java.util.*;

class Circle {
	float radius;

	Circle(float radius) {
		this.radius = radius;
	}

	float calcArea() {
		float area = (float) (3.14 * radius * radius);
		return area;
	}
}

class Sector extends Circle {
	float radian;
	Sector(float radius,float radian) {
		super(radius);
		this.radian = radian;
	}
	
	float calcArea() {
		float area = (float) (0.5 * radian * radius * radius);
		return area;
	}
}

class Segment extends Circle {
	float length;

	Segment(float radius,float length) {
		super(radius);
		this.length = length;
	}

	float calcArea() {
		float area=(float) ((radius*radius)*((radius-length)/length)-(radius-length)*Math.pow((2*radius*length-(length*length)),0.5));
		return area;
	}
}

class CircleMain {
    public static void main(String[] args) {
        Scanner ob = new Scanner (System.in);
        System.out.println("Enter the the radius of circle");
		float radius=ob.nextFloat();
		Circle circle=new Circle(radius);
		System.out.println("The area of the circle is "+circle.calcArea());

        System.out.println("Enter the value of radian");
		float radian=ob.nextFloat();
		Sector sector = new Sector(radius,radian);
		System.out.println("The area of the sector is "+sector.calcArea());

        System.out.println("Enter the value of length");
		float length=ob.nextFloat();
		Segment segment = new Segment(radius,length);
		System.out.println("The area of the Segment is "+segment.calcArea());
    }
}