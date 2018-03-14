package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot bb8 = new Robot();
		bb8.setPenColor(Color.BLUE);
		bb8.penDown();
		bb8.sparkle();
		bb8.setSpeed(10);
		bb8.miniaturize();
		for (int i = 0; i < 100; i++) {
			bb8.move(105);
			bb8.turn(90);
		}
	}
}
