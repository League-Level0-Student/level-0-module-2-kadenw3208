package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class randomlotterynumbers {
	static Random ran=new Random();
public static void main(String[] args) {
	String number="";
	for (int i=0; i<6; i++) {
	  
	  int u=ran.nextInt(100);
	  number+=" "+u;
	  JOptionPane.showMessageDialog(null, number);
	}
	
}}
