package section4;

import java.applet.AudioClip;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class Backup {
	// 1. Create a main method and put all of the code below inside of it
	static boolean runGame = true;
	static int playerHealth = 100;
	// 3. Create a variable called "dragonHealth" to store the dragon's health (set
	// it equal to 100)
	static int dragonHealth = 100;

	// 4. Create a variable to hold the damage the player's attack does each round
	static int playerAttackDmg;

	// 5. Create a variable to hold the damage the dragon's attack does each round
	static int dragonAttackDmg;

	static int randomNum;

	static int specialPower = 0;

	public static void main(String[] args) {

		while (runGame) {
			dragonFight();
		}

	}

	static void dragonFight() {
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");
		
		
		


		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", JOptionPane.PLAIN_MESSAGE,dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)

		// 6. Delete the slashes at the beginning of the next line.
		while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the battle going until someone's
			// health reaches 0

			// 7. Add a closing mustache at the very bottom of this program (since we just
			// added an opening mustache on the previous step).

			// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
			// or a kick

			attacking();

			if (playerHealth <= 0) {

				// -- Tell the user that they lost
				JOptionPane.showMessageDialog(null, "You have lost!");

				int redo = JOptionPane.showConfirmDialog(null, "Do You Want To Play Again");
				if (redo == 0) {
					runGame = true;
				} else {
					runGame = false;
				}
			}

			// 14. Else if the dragon's health is less than or equal to 0

			else if (dragonHealth <= 0) {
				JOptionPane.showMessageDialog(null, "The Dragon is dead and you have recieved tons of Gold!");
				int redo = JOptionPane.showConfirmDialog(null, "Do You Want To Play Again");
				if (redo == 0) {
					runGame = true;
				} else {
					runGame = false;
				}

			}

			// -- Tell the user that the dragon is dead and they took a ton of gold!

			// 15. Else

			else {
				JOptionPane.showMessageDialog(null, "Currently You Have " + playerHealth + " Health"
						+ "\n The Dragon has " + dragonHealth + " Health");
			}

			// -- Pop up a message that tells the their current health and the dragon's
			// currently health (Bonus: Also display the amount of health that was lost for
			// each player this round)
		}
	}

	static void attacking() {
		String typeOfAttack = JOptionPane.showInputDialog(
				"Do You Want To Attack The Dragon with a Yell, Kick, or one time use 'Special Power'?");

		// 9. If they typed in "yell":

		if (typeOfAttack.equalsIgnoreCase("yell")) {

			// -- Find a random number between 0 and 10 and store it in dragonDamage

			randomNum = new Random().nextInt(11);

			// -- Subtract that number from the dragon's health variable

			dragonHealth = dragonHealth - randomNum;
		}

		// 10. If they typed in "kick":

		if (typeOfAttack.equalsIgnoreCase("kick")) {

			// -- Find a random number between 0 and 25 and storue it in dragonDamage
			randomNum = new Random().nextInt(26);

			// -- Subtract that number from the dragon's health variable

			dragonHealth = dragonHealth - randomNum;

		}

		if (typeOfAttack.equalsIgnoreCase("special power")) {
			if (specialPower == 0) {
				randomNum = new Random().nextInt(21) + 20;
				dragonHealth -= randomNum;
				specialPower++;
			} else {
				JOptionPane.showMessageDialog(null, "Sorry you have already used up the special power!");
				System.out.println(playerHealth);
				attacking();
			}
		}

		// 11. Find a random number between 0 and 35 and store it in playerDamage

		randomNum = new Random().nextInt(35);

		// 12. Subtract this number from the player's health

		playerHealth = playerHealth - randomNum;

		// 13. If the user's health is less than or equal to 0
	}
	

}
