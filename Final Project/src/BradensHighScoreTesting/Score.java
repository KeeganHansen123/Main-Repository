package BradensHighScoreTesting;

import javax.swing.JOptionPane;

import FinalApplication.BaseQuestion;

public class Score {
		
	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				 int attemptsNum = 0;
				    final int maxAttempts = 1;
				    int user;
					int comp;
					int score = 500;
					do {
					score -= 10;
					
					JOptionPane.showMessageDialog(null, "-10");
				    JOptionPane.showMessageDialog(null, "Your Score is "+ score);
				    } while (++attemptsNum <maxAttempts );

				    if (attemptsNum == maxAttempts);
				    
				    BaseQuestion.main(null);
					
	}
}

		
	


