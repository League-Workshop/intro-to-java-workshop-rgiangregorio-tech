package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	
		int distance = 100;
		
		Robot ryan = new Robot();
		
		ryan.setSpeed(100);
		ryan.penDown();
		
		for (int i = 0; i < 4; i++) {
			ryan.turn(90);
			ryan.move(distance);
		}
	
		
	}
}
