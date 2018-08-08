package section3;

import javax.swing.JOptionPane;

public class Greeter {
public static void main(String[] args) {
	String name = JOptionPane.showInputDialog("Who are you?");
	JOptionPane.showMessageDialog(null,"Good Afternoon, " + name);
}
}
