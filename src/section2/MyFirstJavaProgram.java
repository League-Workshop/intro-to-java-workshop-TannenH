package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	System.out.println("Hello World!");
	Robot tannen = new Robot();
	tannen.miniaturize();
	tannen.setSpeed(250);
	tannen.setRandomPenColor();
	tannen.penDown();
	for (int i = 0; i < 4; i++) {
		tannen.setRandomPenColor();
		tannen.move(200);
		tannen.turn(90);
	}
	
		
	}
}
