
import java.util.Scanner;
public class q1_CWC {

	public static void main(String[] args) {		
	  int count = 0;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter number of elements you want to enter: ");
	  int x = sc.nextInt();
      int[] num = new int [x];
      for(int i =0; i<num.length ; i++) {
    	  Scanner in = new Scanner(System.in);
    	  System.out.println("Enter element "+(i+1)+": ");
    	  num[i]=sc.nextInt();
      }
      for(int i =0;i<num.length-1;i++) {
          for(int j=0;j<num.length-i-1;j++) {
         	 if(num[j]>num[j+1]) {
         		 int temp=0;
         		 temp=num[j];
         		 num[j]=num[j+1];
         		 num[j+1]=temp;
         		 count++;
         	 }
          }
      }
         for(int k =0;k<num.length;k++) {
             System.out.println(num[k]); 
         }
         System.out.println("Minimum number of swaps required : "+count);
	}

}