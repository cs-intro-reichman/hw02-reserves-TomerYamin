/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	int min = 0;
	int max = 10;
	int firstNum = (int)((Math.random()*max - min +1) + min -1);
	
	System.out.print(firstNum);	
	
	int nextNum = (int)((Math.random()*max - min +1) + min -1); 

	while (nextNum > firstNum) {
	System.out.print(" " + nextNum);
	firstNum = nextNum;
	nextNum = (int)((Math.random()*max - min +1) + min -1); 
	
	}


	}
}
