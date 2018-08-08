package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		
		String code = JOptionPane.showInputDialog("Do you know how to code?");
		
		String name = JOptionPane.showInputDialog("What is your name?");

		// 2. If they say "yes", tell them they will rule the world.
				
				if(code.equalsIgnoreCase("yes")) {
					JOptionPane.showMessageDialog(null, name + " you will rule the world!!!");
				}

		// 3. Otherwise, wish them good luck washing dishes.
				
				else {
					JOptionPane.showMessageDialog(null, "Have fun washing dishes!");
				}

	}
}

