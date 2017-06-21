package hw1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		if(isPrime(7) == true ) {
			System.out.println("prime");
		} else {
			System.out.println(" not prime");
		}
		if(isPrime(10) == false ) {
			System.out.println("prime");
		} else {
			System.out.println("not prime");
		}
	}
	
	
	static boolean isPrime(int n){
		boolean result = true;
	    for(int i=2; i<n; i++){
	        if(n%i==0)
	        {
	            result = false; 
	        } else 
	        {
	        	result = true;
	        }
	       
	    }
	    return result;
	    
	}

}
