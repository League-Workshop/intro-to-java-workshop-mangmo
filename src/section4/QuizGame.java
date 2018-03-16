package section4;

import javax.swing.JOptionPane;

import com.sun.corba.se.spi.orbutil.fsm.Input;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int Score=0; 
		// 2.  Ask the user a question 
 String garretthedog = JOptionPane.showInputDialog("what's 9 + 10");
		// 3.  Use an if statement to check if their answer is correct
	 if(garretthedog.equalsIgnoreCase("21")) {
     JOptionPane.showConfirmDialog(null, "you know your memes well");
	 
	JOptionPane.showInputDialog("you have one point")	;
	 } else {
	JOptionPane.showMessageDialog(null, "why did you toucha my speghett");
	 int score=1;	
	 }
	 JOptionPane.showInputDialog("what year was do you know de wae made in");
	 if(garretthedog.equalsIgnoreCase("2018")) {
	 JOptionPane.showConfirmDialog(null, "you know your memes well");
	 JOptionPane.showInputDialog("you have two points point")	;
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
	 JOptionPane.showInputDialog("good job you have beet the MEME QUIZ you got 2 points")	;
	}
}
}