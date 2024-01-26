/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
	int num1 = Integer.parseInt(args[0]);
	int divisor = 2;
	int sumDivisors = 1;
	String finalText = num1 + " is a perfect number since " + num1 + " = 1";

	while (divisor < num1) {
		if (num1%divisor == 0) {
		sumDivisors += divisor;
		finalText = finalText + " + " + divisor;
		}
			  
	divisor++;

	}

	if (num1 == sumDivisors) {
	System.out.println(finalText);	

	} 
	
	else {
	System.out.println(num1 + " is not a perfect number");
	}


	}
}
