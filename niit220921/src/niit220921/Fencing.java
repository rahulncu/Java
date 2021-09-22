package niit220921;
import java.util.*;

public class Fencing {
	
	static double squareFence(double s) {
		return s*s;		
	}
	static double circularFence(double r){
		return 3.14*r*r;
	}
	static double rectangleFence(double l,double b){
		return l*b;
	}
	
	
	public static void main(String args[]) {
		int option;
		
		double side,length,breadth,radius;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Select an option from list to calculate are of fence"
				+ "\n1. Square area for the chikens"
				+ "\n2. Circular area for ducks"
				+ "\n3. Rectangular area for cows");
		
		option=s.nextInt();
		
		if(option==1) {
			System.out.println("Enter side of square :");
			side=s.nextDouble();
			System.out.println("Area of square fence for chickens is "+squareFence(side));
		}
		else if(option==2) {
			System.out.println("Enter radius of circle :");
			radius=s.nextDouble();
			System.out.println("Area of circular fence for ducks is "+circularFence(radius));
		}
		else {
			System.out.println("Enter length and bredth of rectangle :");
			length=s.nextDouble();
			breadth=s.nextDouble();
			System.out.println("Area of Rectangular fence for cows is "+rectangleFence(length,breadth));
		}
	}

}
