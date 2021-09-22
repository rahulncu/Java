package niit220921;
import java.util.*;

public class pH {

	public static void main(String[] args) {
		double ph;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter pH vale of water:");
		ph=s.nextDouble();
		
		if(ph<0 || ph>14) {
			System.out.println("Invalid range");
			System.exit(0);
		}
		
		if(ph<7)
			System.out.println("pH value is low, partial water change required");
		else if(ph>=7&&ph<=8)
			System.out.println("pH value is fine");
		else
			System.out.println("pH value is high, partial water change required");

	}

}
