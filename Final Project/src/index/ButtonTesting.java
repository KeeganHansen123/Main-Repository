package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTesting extends JFrame {


		private final int SIZE = 180;
		private Container con = getContentPane();
		private JButton button = new JButton("Press Me");
		public ButtonTesting()
		{
			setSize(SIZE, SIZE);
			con.setLayout(new FlowLayout());
			con.add(button);
			con.setBackground(Color.YELLOW);
			button.setBackground(Color.RED);
			button.setForeground(Color.WHITE);
		}
		public static void main(String[] args)
		{
			ButtonTesting frame = new ButtonTesting();
			frame.setVisible(true);
		}

			
		}
	


