
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(11);
		
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times

		for(int i=0;i<5;i++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 

		
		String userResponse = JOptionPane.showInputDialog("guess a number from 0 to 10");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
int userResponse1=Integer.parseInt(userResponse);
			// 5. if the guess is correct
if(userResponse1==random) {
	JOptionPane.showMessageDialog(null, "You won! :)");
	System.exit(0);
}
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
else if(userResponse1>random) {
	JOptionPane.showMessageDialog(null,"your guess is to high");
}
				// 8. Tell them it's too high
			// 9. if the guess is low
else if(userResponse1<random) {
	JOptionPane.showMessageDialog(null,"your guess is to low");
}
i+=1;
		}
				// 10. Tell them it's too low
		JOptionPane.showMessageDialog(null,"you lose :(");
}
		// 13. Tell them they lose

		
	}




