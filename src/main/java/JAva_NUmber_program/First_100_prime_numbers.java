package JAva_NUmber_program;

import org.testng.annotations.Test;

public class First_100_prime_numbers {

	@Test
	public void Prime100()
	{
		  int count = 0;
	        int num = 2;
	        while (count < 100) {
	            boolean isPrime = true;
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	            if (isPrime) {
	                System.out.print(num + " ");
	                count++;
	            }
	            num++;
	        }
		
	}
	
	
	
	
}
