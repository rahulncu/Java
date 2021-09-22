package niit220921;
import java.util.*;

public class doubleDigits {

	static String doubleDigits(int n) {
		if(n==0)
			return "";
		int lastnum= n%10;
		int restnum=n/10;
		return doubleDigits(restnum)+ Integer.toString(lastnum)+Integer.toString(lastnum);
	}
	
	public static void main(String arg[]) {
		int n;
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter the number");
		n=s.nextInt();

		
		if(n==0)
			System.out.println("0");
		else if(n>0)
			System.out.println(doubleDigits(n));
		else
			System.out.println("-"+doubleDigits(n*-1));
		
	}

}
