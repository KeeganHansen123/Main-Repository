package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonTesting extends JFrame {


		private final int SIZE = 180;
		private Container con = getContentPane();
		private JButton button = new JButton("Play");
		public ButtonTesting()
		{
			setSize(SIZE, SIZE);
			con.setLayout(new FlowLayout());
			con.add(button);
			con.setBackground(Color.BLACK);
			button.setBackground(Color.BLUE);
			button.setForeground(Color.WHITE);
		}
		public static void main(String[] args)
		{
			ButtonTesting frame = new ButtonTesting();
			frame.setVisible(true);
		}

			
		}
	


