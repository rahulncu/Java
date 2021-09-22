package niit220921;
import java.util.*;

public class digitalCalander {
	public static void main(String arg[]) {
		String days[]= {"S","M","Tu","W","Th","F","S"};
		
		int month,wday,year,n;
		
		Scanner s= new Scanner(System.in);
		
		System.out.println("Enter month (1 for Jan, 2 for Feb,...,12 for Dec) : " );
		month=s.nextInt();
		
		System.out.println("Enter Year : ");
		year=s.nextInt();
		
		System.out.println("Enter Day of the week(1 for Mon, 2 for Tue,...,7 for Sun)");
		wday=s.nextInt();
		
		for(int i=0;i<7;i++) {
			System.out.print(days[i]+"\t");
		}
		System.out.println();
		
		int j=1;
		
		for(;j<wday+1;j++) 
			System.out.print(" \t");
			

		
		if(month==2) {
			if((year%400==0)||((year%4==0)&&(year%100!=0))) 
				n=29;
			
			else
				n=28;
		}
		else if(((month-1)%7)%2==0)
			n=31;
		else
			n=30;

		for(int i=1;i<=n;i++,j++) {
			System.out.print(i+"\t");
			if(j%7==0)
				System.out.println();
			
		}
		
	}

}
