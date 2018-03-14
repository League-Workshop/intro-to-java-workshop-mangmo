package section2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {

	// 2. Create a new Robot
	Robot jeff = new Robot();
	

	void go() {
		// 4. Make the robot move as fast as possible
		jeff.setSpeed(1000);
		jeff.moveTo(100,700);
		// 5. Set the pen width to 5
		jeff.setPenWidth(5);
		jeff.penDown();

		// 6. Use a for loop to repeat steps #7 to #8, four times...
		for (int i = 0; i < 4; i++) {
			jeff.turn(90);
			jeff.move(200);
			for (int j = 0; j < 4; j++) {
				jeff.turn(100);
				jeff.move(130);
			}
			// 7. Set the pen color to random
			jeff.setRandomPenColor();
			// 1. Call the drawSquare() method
			drawSquare();
			// 8. Turn the robot 90 degrees to the right
			jeff.turn(90);
		}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		jeff.turn(90);
		jeff.move(100);
		jeff.turn(90);
		jeff.move(100);
		jeff.turn(90);
		jeff.move(100);
		jeff.turn(90);
		jeff.move(100);
		jeff.turn(90);
		jeff.move(100);

	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}
