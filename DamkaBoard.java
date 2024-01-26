/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);

	for (int i = 0; i < num1; i++) {
		for (int j = 0; j < num1; j++) {
			if (i%2 == 0) {
				System.out.print("* ");
			}
			
			else {
				System.out.print(" *");
			}	
		}
	System.out.println();		
	}


	} 
}