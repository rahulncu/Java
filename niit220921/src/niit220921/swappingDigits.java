package niit220921;
import java.util.*;

public class swappingDigits {
	public static void main(String arg[]) {
		int n;
		char temp;
		Scanner s=new Scanner(System.in);
		System.out.print("Enter the number : ");
		n=s.nextInt();
		
		String str=Integer.toString(n);
		
		int numlen = str.length();
		
		StringBuilder swappedstr = new StringBuilder(numlen);
		
		if(numlen%2==0) {
			for(int i=0;i<numlen;i+=2) {
				swappedstr.append(str.charAt(i+1));
				swappedstr.append(str.charAt(i));
				
			}
		}
		else {
			swappedstr.append(str.charAt(0));
			for(int i=1;i<numlen;i+=2) {
				swappedstr.append(str.charAt(i+1));
				swappedstr.append(str.charAt(i));
				
			}
			
		}
		
		System.out.println("SwappedNumber = "+Integer.parseInt(swappedstr.toString()));
		
		
		
	}

}
