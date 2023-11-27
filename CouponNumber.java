
import java.util.Scanner;

public class CouponNumber {
		    public static int getCouponNumber(int n) {
		        return (int) (Math.random() * n);
		    }
		    public static void main(String args[]) {
		    	int n;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter n");
		    	n=sc.nextInt();
		    	
		        boolean[] isCollected = new boolean[n];  
		        int count = 0;                           
		        int distinct  = 0;                      
		        while (distinct < n) {
		            int value = getCouponNumber(n);            
		            count++;                             
		            if (!isCollected[value]) {           
		                distinct++;
		                isCollected[value] = true;
		            }
		        }
		        System.out.println("Count is "+count);
		    }

}

