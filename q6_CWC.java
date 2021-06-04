
import java.util.Scanner;
public class q6_CWC {
	public static void main(String args[])  
	{  
	int a, b, c;  
	System.out.println("Enter three integers: ");  
	Scanner in = new Scanner(System.in);  
	a=in.nextInt();  
	b=in.nextInt();  
	c=in.nextInt();  
	System.out.println("Maximum number is : ");
	System.out.println((a>b&&a>c)?a:(b>a&&b>c)?b:c);
	
	    }
	}
