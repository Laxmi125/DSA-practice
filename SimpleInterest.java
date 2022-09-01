
package Lec1;
import java.util.*;
public class SimpleInterest
{
	public static void main(String[] args){
		Scanner scn=new Scanner(System.in);
		int p,t,r;
		System.out.println("Enter p value ");
		p=scn.nextInt();
		System.out.println("Enter time in no of year");
		t=scn.nextInt();
		System.out.println("Enter r value ");
		r=scn.nextInt();
		int si=(p*t*r)/100;
		System.out.println("SI = "+si);
	}
}
