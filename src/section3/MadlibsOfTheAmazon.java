package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested \n river, here's how to do it...");
		
		// Get the user to enter an adjective
		
		String Adjective = JOptionPane.showInputDialog("Put in a Adjective!");

		// Get the user to enter a type of liquid
		
		String Liquid = JOptionPane.showInputDialog("Put in a type of Liquid!");

		// Get the user to enter a body part
		
		String Part = JOptionPane.showInputDialog("Put in a Body Part!");

		// Get the user to enter a verb
		
		String Verb = JOptionPane.showInputDialog("Put in a Verb!");

		// Get the user to enter a place
		
		String Location = JOptionPane.showInputDialog("Put in a Location or Place!");

		// Fit the user's words into this sentence, and save it in a String:
		// Piranhas are more [adjective] during the day, so cross the river at
		// night. Piranhas are attracted to fresh [type of liquid] and will most
		// likely take a bite out of your [body part] if you [verb]. Whatever
		// you do, if you have an open wound, try to find another way to get
		// back to the [place]. Good luck!
		
		JOptionPane.showMessageDialog(null,"Piranhas are more " + Adjective +  " during the day, so cross the river at \n night. Piranhas are attracted to fresh " + Liquid + " and will most"
				+ "\n likely take a bite out of your " + Part + " if you " + Verb + ". Whatever you do, \n if you have an open wound, try to find another way to get back to the "+ Location +". Good Luck!");
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		

	}
}

