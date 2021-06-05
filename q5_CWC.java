
public class q5_CWC {
	
	public static void main(String[] args) {
		
     int[] arr = {8,6,4,9,1};
     for(int i=0;i<arr.length-1;i++) {
    	 for(int j=i+1;j<arr.length;j++) {
    		 if(arr[i]>arr[j]) {
    			 System.out.println("{"+arr[i]+" , "+arr[j]+"}");
    			 count++;
    		 }
		 else{
			  System.out.println(0);
		 }
    	 }
    	 
     }
     System.out.println("Number of inversion count: "+count);
	}

}
