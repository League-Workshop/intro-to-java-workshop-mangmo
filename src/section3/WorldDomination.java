package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
      String blah=JOptionPane.showInputDialog("do you know how to code");
		// 2. If they say "yes", tell them they will rule the world.
        if(blah.equals("yes")) {
        		JOptionPane.showInputDialog("you will dominate the world");
        }
        else {
     JOptionPane.showMessageDialog(null, "in the arms of the angels");
	}
}
}
