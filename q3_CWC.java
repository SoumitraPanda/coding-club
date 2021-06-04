
import java.util.Scanner;
public class q3_CWC {

	
	    public static void main(String args[])
	    {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number till u want to print : ");
	        int n=sc.nextInt();

	        int a = 0,b = 1,c = 1;
	        int d = a+b+c;

	   
	        System.out.println (a+" ");
	        System.out.println (b+" ");
	        System.out.println (c+" ");
	        System.out.println (d+" ");
	        
	        for(int i=5;i<=n;i++)
	        {
	            
	            a=b;
	            b=c;
	            c=d;
	            d=a+b+c;
	       

	        System.out.println(d+" ");
	    }
	}
}	    
