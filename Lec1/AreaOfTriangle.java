package Lec1;

import java.util.*;
public class AreaOfTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int a,b,c;
		double s,area;
		System.out.println("Enter value of all 3 sides ");
		a=scn.nextInt();
		b=scn.nextInt();
		c=scn.nextInt();
		s=(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of Triangle  = "+area);

	}
}
