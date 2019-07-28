package recursion;

public class Recursion_test {

	public Recursion_test() {
		
		double x = 5;
		int n = 2;
		
//		while (n != 1) {
//		}
			
//			System.out.println(power(x, n));
//		for (int i=n; i>0; i--) {
//		power(x, n);
			
         power(x, n);
		

		

	}
	
	public static double power(double x, int n){                                                                 
	    if(n==0)
	        return 1;
	    else{
	    	
	        return x * power(x, n-1);
	        
	    }
	    
	}

	public static void main(String[] args) {
		
		new Recursion_test();
		

	}

}
