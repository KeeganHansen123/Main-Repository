package index;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonTestingTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JButton close = new JButton("Close");
		close.addActionListener(new CloseListener());
		
	close.addActionListener(new CloseListener());
		
		private class CloseListener implements ActionListener{
			@Override
		}
			public void actionPerformed(ActionEvent E) {
				System.exit(0);
				
			}
				
				

	}

}
