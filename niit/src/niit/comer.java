package niit;
import java.util.*;

//Question No. 1
public class comer {
	public static void main(String arg[]) {
		int spend, price, bought,free;
		free=0;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the amount want to spend : ");
		spend=s.nextInt();
		
		System.out.println("Enter price of an item : ");
		price=s.nextInt();
		
		System.out.println("Enter the no. of items bought : ");
		bought=s.nextInt();
		
		int itemstobuy=spend/price;
		
		if (itemstobuy>=10) {
			free=itemstobuy/10;
		}
		
		bought+=itemstobuy;
		
		System.out.println("Total number of items (free+purchased) : "+(free+itemstobuy));
		
	}

}
