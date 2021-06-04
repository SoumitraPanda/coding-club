
import java.util.Scanner;
public class q3_CWC {


    public static void main(String [] args)
    { 
        Scanner in=new Scanner(System.in);
        System.out.println("enter n");
        int x=in.nextInt();
        int a=0,b=1,c=1;
        System.out.print(a+" ");
        if(x>1)
            System.out.print(b+" ");
        if(x>2)
            System.out.print(c+" ");
                for(int i=3;i<n;i++)
                {
                    int y=a+b+c;
                    a=b;
                    c=y;
                    System.out.print(y+" ");
                }
    }
}    
