package niit220921;
import java.util.*;

public class wageCal {
	public static void main(String arg[]) {
		int hours;
		double sal,baseS;
		
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter name of the employee : ");
		String name=s.next();
		System.out.println("Enter base pay of the employee : ");
		baseS=s.nextDouble();
		System.out.println("Enter number of hours worked by the employee : ");
		hours=s.nextInt();
		
		System.out.println("Name :: "+name);
		System.out.println("Base pay :: "+baseS+"$");
		System.out.println("Hours worked :: "+hours);
		System.out.println();
		
		if(hours<=60 && baseS==12) {
			if(hours>=45)
				sal=(5*baseS*2+(hours-5)*baseS);
			else
				sal=hours*baseS;
		}
		else
			sal=0;
		
		System.out.println("Salary of employee :: "+sal+"$");
		
		
		
	}
}
