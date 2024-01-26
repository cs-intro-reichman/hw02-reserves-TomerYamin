
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {

	int numOfChildren = 0;
	boolean boyChild = false;
	boolean girlChild = false;
	double randomNum = Math.random();

	while  (!(girlChild && boyChild)) {
		
		randomNum = Math.random();

		if (randomNum < 0.5) {
		System.out.print("g ");
		girlChild = true;
		}
		
		else {
		System.out.print("b ");
		boyChild = true;
		} 	
	numOfChildren++;	
	}
	
	System.out.println("You made it... and now you have " + numOfChildren + " children");

	}
}
