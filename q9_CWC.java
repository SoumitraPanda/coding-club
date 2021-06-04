
import java.util.Scanner;
public class q9_CWC {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to reverse");
			String text = sc.nextLine();
			char[] arr = text.toCharArray();
			
			
			String rev = "";
			for (char i : arr)
			    rev = i + rev;
			System.out.println(rev);
		}

  
	}
