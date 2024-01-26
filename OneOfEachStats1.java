/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		//// Put your code here
		int T = Integer.parseInt(args[0]);
 
		int sumOfChildren = 0;
		int numberOf2Children = 0;
		int numberOf3Children = 0;
		int numberOf4OrMoreChildren = 0;		

	for (int i =0; i < T; i++) {
		
		boolean boy = false;
		boolean girl = false;
		int count = 0;

		while  (!(girl && boy)) {
			double rnd = Math.random;

			if (rnd < 0.5) {
			boy = true;
			}
		
			else {
			girl = true;
			} 	
		count++;	
		}
		
		sumOfChildren += count;

		if (count == 2) {
			numberOf2Children++;
		}	

		else {
			if (count == 3) {
				numberOf3Children++;
			}

			else {
				numberOf4OrMoreChildren++;
			}

	
		}
	}
	
	
	double average = ((double)(sumOfChildren)/(double)(T));
	System.out.println("Average: " + average + " children to get at least one of each gender.");
	System.out.println("Number of families with 2 children: " + numberOf2Children);
	System.out.println("Number of families with 3 children: " + numberOf3Children);
	System.out.println("Number of families with 4 or more children: " + numberOf4OrMoreChildren);
	
	String maxStr = "The most common number of children is ";

	int max = Math.max(Math.max(numberOf2Children, numberOf3Children),numberOf4OrMoreChildren);

	if (max == numberOf2Children ) {
	maxStr = maxStr + "2.";	
	}	
	
	else {
		if (max == numberOf2Children ) {
		maxStr = maxStr + "3.";	
		}
		
		else {
		maxStr = maxStr + "4 or more.";	
		}
	}
	
	System.out.println(maxStr);


	}
}
