package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
    public static void main(String[] args) {
		
	        Random selector = new Random();
	        
	        int randomNumber = selector.nextInt(4);
	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
   
	// 3. Print out this variable

	// 4. Get the user to enter something that they think is awesome
    JOptionPane.showInputDialog("What do you think is awesome?");
	// 5. If the random number is 0
    if(randomNumber==0) {
	// -- tell the user whatever they entered is awesome!
    JOptionPane.showMessageDialog(null, "That is awesome!");}
	// 6. If the random number is 1
    if(randomNumber==1) {
	// -- tell the user whatever they entered is ok.
    JOptionPane.showMessageDialog(null, "It is ok.");}
	// 7. If the random number is 2
    if(randomNumber==2) {
	// -- tell the user whatever they entered is boring.
    JOptionPane.showMessageDialog(null, "It is boring.");}
	// 8. If the random number is 3
    if(randomNumber==3) {
	// -- write your own answer
    JOptionPane.showMessageDialog(null, "It is decent.");	
    }
    }}


