package section4;

import javax.swing.JOptionPane;

public class QuizGame {
static int score = 0;
	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score

		
		String answer = null;
		String question = null;

		String[] questions = new String[4];
		questions[0] = "What color is the sky?";
		questions[1] = "Who is the creator of this game?";
		questions[2] = "What is my dads name?";
		questions[3] = "What is my moms name?";

		String[] answers = new String[4];
		answers[0] = "Blue";
		answers[1] = "Tannen";
		answers[2] = "Chris";
		answers[3] = "Celee";

		for (int round = 0; round < 4; round++) {

			question = JOptionPane.showInputDialog(questions[round]);
			answer = answers[round];

			if (question.equalsIgnoreCase(answer)) {
				JOptionPane.showMessageDialog(null, "Correct!");
				score++;
			} else {
				JOptionPane.showMessageDialog(null, "Incorrect!");
				if (score > 0) {

				}
			}

			JOptionPane.showMessageDialog(null, "You have " + score + " points.");
			speak("You have " + score + " Points");
		}

		if (score == 4) {
			JOptionPane.showMessageDialog(null, "WOW! you got 100%");
		}

		if (score == 3) {
			JOptionPane.showMessageDialog(null, "Nice! you got 75%!!!");
		}

		if (score == 2) {
			JOptionPane.showMessageDialog(null, "Decent job! you got 50%");
		}

		if (score == 1) {
			JOptionPane.showMessageDialog(null, "You could have done better... 25%");
		}

		if (score == 0) {
			JOptionPane.showMessageDialog(null, "WOW! You suck you got none right!");
		}

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	static void correct() {
		
		

	}
}
