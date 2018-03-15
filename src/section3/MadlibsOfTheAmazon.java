package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		String lilpump =JOptionPane.showInputDialog("If you find yourself having to cross a piranha-infested river, here's how to do it type okay to learn");
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		
		// Get the user to enter an adjective
         lilpump =JOptionPane.showInputDialog("enter an adjective to not die");
		// Get the user to enter a type of liquid
         String liquid =JOptionPane.showInputDialog("enter in a type of liquid");
		// Get the user to enter a body part
         String bodypart =JOptionPane.showInputDialog("enter in a body part");
		// Get the user to enter a verb
         String verb =JOptionPane.showInputDialog("enter in a verb");
		// Get the user to enter a place
         String place =JOptionPane.showInputDialog("enter in a place");
		 String l ="Piranhas are more [adjective] during the day, so cross the river at night. Piranhas are attracted to fresh [type of liquid] and will most"
		 		+ " likely take a bite out of your [body part] if you [verb]. Whatever"
		 		+ "you do, if you have an open wound, try to find another way to get"
		 		+ " back to the [place]. Good luck!";
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		
       JOptionPane.showMessageDialog(null, "Pirhans are more" + lilpump + "during the day, so cross the river at night. piranhas are attracted to fresh"+ liquid + "and will most likely take a bite out of your"+ bodypart + "if you"+ verb + "whatever you do if you have an open wound, try to find another way to get back to the"+ place + "good luck");
	}
}

