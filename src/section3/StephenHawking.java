package section3;

import javax.swing.JOptionPane;
import com.sun.speech.freetts.Voice;
import com.sun.speech.freetts.VoiceManager;

public class StephenHawking {
	
	// 1. make a main method and put steps 2, 3 & 4 inside it
	
	public static void main(String[] args) {
		
	for (int i = 5; i < 6; i--) {
		
	
	
	// 4. Use a for loop to repeat steps #2 and #3, a lot of times
		
		String sentence = JOptionPane.showInputDialog("Write A Sentence!");
	
	// 2. ask the user for a sentence
		
		speak(sentence);
	
	// 3. call the speak method below and send it the sentence
	}
	}

	
	
	
	
	
	
	
	/* Don’t change this…. */
	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}

}
