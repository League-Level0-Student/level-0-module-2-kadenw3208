package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String[] args) {
String input=JOptionPane.showInputDialog("Please enter your age.");
int myage=Integer.parseInt(input);
if(myage>=18) {
 JOptionPane.showInputDialog("Who should the next president be: Trump or Biden?");
 JOptionPane.showMessageDialog(null, "Great! Your vote has been taken!");
}

else {
JOptionPane.showMessageDialog(null, "Nobody cares about what you think! Sorry!");
	}
}
}
