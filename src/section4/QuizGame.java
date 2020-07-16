package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int userScore = 0;
		// 2.  Ask the user a question 
		String answer1 = JOptionPane.showInputDialog("If x=7, then what is 2x - 3x + (9/3)?");
		// 3.  Use an if statement to check if their answer is correct
		if(answer1.equals("-4")) {
		// 4.  if the user's answer was correct, add one to their score
			userScore += 1;
		}
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		String answer2 = JOptionPane.showInputDialog("How far away do you have to be to meet the social distancing guidelines?");
		// 6.  After all the questions have been asked, print the user's score 
		if(answer2.equals("6 feet")) {
			userScore += 1;
		}
			String answer3 = JOptionPane.showInputDialog("Who is the male who had two number one songs in 2019?");
			if(answer3.equals("Post Malone")) {
			userScore += 1;	
			}
			JOptionPane.showMessageDialog(null, "Your final score is " + userScore + "!");
			}
		}
		
	

