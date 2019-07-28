package recursion;
//simple recursion example

public class factorial {

	public factorial() {

		//find 5!
		int n = 5;
	
		//call the method below and print the result
		System.out.println(factorial(n));
		
	}
	
	public static int factorial(int n) {
	    
		if (n == 1)
	    	//base case
	        return 1;
	    else
	    	//recursive case; call its method if n > 1
	        return n * factorial(n-1);
	}

	public static void main(String[] args) {
		//invoke constructor
		new factorial();
	}

}
