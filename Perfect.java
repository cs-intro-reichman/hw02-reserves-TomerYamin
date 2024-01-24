/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int num1 = Integer.parseInt(args[0]);
	int divisor = 1;
	int sumDivisors = 0;
	while (divisor < num1) {
		if (num1%divisor == 0) {
		sumDivisors += divisor;
		}
	divisor++;

	}

	if (num1 == sumDivisors) {
	System.out.println(num1 + " is a perfect number");	

	} 
	
	else {
	System.out.println(num1 + " is not a perfect number");
	}


	}
}
