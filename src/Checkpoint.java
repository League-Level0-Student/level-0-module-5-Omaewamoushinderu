
import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;

public class Checkpoint {
public static void main(String[] args) {
	String color = JOptionPane.showInputDialog("What's your favorite color?");
	JOptionPane.showMessageDialog(null , "Your favorite color is " + color);
Robot skrt = new Robot(); 
skrt.penDown();
skrt.setSpeed(10000);
for(int i=0 ; i<3 ;i++) {
	skrt.move(100);
	skrt.turn(120);
	skrt.hide();
}
}
}
