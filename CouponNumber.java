
import java.util.Scanner;

public class CouponNumber {
		    public static int getCouponNumber(int N) {
		        return (int) (Math.random() * N);
		    }
		    public static void main(String args[]) {
		    	int N;
		    	Scanner sc=new Scanner(System.in);
		    	System.out.println("Enter N");
		    	N=sc.nextInt();
		    	
		        boolean[] isCollected = new boolean[N];  
		        int count = 0;                           
		        int distinct  = 0;                      
		        while (distinct < N) {
		            int value = getCouponNumber(N);            
		            count++;                             
		            if (!isCollected[value]) {           
		                distinct++;
		                isCollected[value] = true;
		            }
		        }
		        System.out.println("Count is "+count);
		    }

}

