package niit;
import java.util.*;

//Question no.2
public class medi {
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		
		int today,gap;
		String[] days = {"Sunday", "Monday", "Tuesday","Wednesday","Thursday","Friday","Saturday"};  
		
		System.out.println("Enter the number of the day today : ");
		today=s.nextInt();
		System.out.println("Enter the gap between medicines in days : ");
		gap=s.nextInt();
		
		int nextday=((today+gap)%7)-1;
		
		System.out.println("Your next dose should be taken on : "+days[nextday]);
		
		
	}

}
