//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	JOptionPane.showInputDialog("What question would yu like the magic 8 ball to answer?");
	// 2. Get the user to enter a question for the 8 ball to answer
	
Random ran=new Random();
int ruckus=ran.nextInt(4);
	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
System.out.println(ruckus);
	if(ruckus==0) {
		JOptionPane.showMessageDialog(null, "Yes.");
	}
	// 4. If the random number is 0
	else if(ruckus==1) {
		JOptionPane.showMessageDialog(null, "No.");
	}
	// -- tell the user "Yes"
	else if(ruckus==2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google?");
	}
	else {
		JOptionPane.showMessageDialog(null,  "No idea. Try to get a friend or other person to help you.");
	}
	// 5. If the random number is 1

	// -- tell the user "No"

	// 6. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 7. If the random number is 3
}
	// -- write your own answer

}
