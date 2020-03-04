//Nick Surace
// 2/18/2020

import javax.swing.JOptionPane;

public class RandomGuess2
{
	public static void main(String[] args) 
	{
		//Variables and Contants
		int userGuess;
		int comNumber;
		String msg;

		//Input
		userGuess = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter a number between 1 and 10!"));

		//Calculation phase
		comNumber = (1 + (int)(Math.random() * 10));

		if(userGuess == comNumber)
		{
			msg = "You Win!!";
		}
		else
		{
			if(userGuess > comNumber)
			{
				msg = "Your guess was too high!";
			}
			else
			{
				msg = "Your guess was too low!";
			}
		}

		//Output
		JOptionPane.showMessageDialog(null, "You guessed a " + userGuess + "\nThe number was a " + comNumber + "\n" + msg);
	}
}