package FinalApplication;

import javax.swing.*;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Menu extends JFrame {
	
		//Creates the title
		private final int SIZE1 = 180;
		private Container con1 = getContentPane();
		private JButton button1 = new JButton("22 Questions");
		
		//Creates the play button
		private final int SIZE2 = 180;
		private Container con2 = getContentPane();
		private JButton button2 = new JButton("Play");

		//Creates the quit button
		private final int SIZE3 = 180;
		private Container con3 = getContentPane();
		private JButton button3 = new JButton("Quit");
		
		public Menu()
		{
			//Sets the size color and if it works or not for the title
			setSize(SIZE1, SIZE1);
			con1.setLayout(new FlowLayout());
			con1.add(button1);
			con1.setBackground(Color.BLACK);
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.GREEN);
			button1.setEnabled(false);
			
			//Sets the size color and if it works or not for the play button
			setSize(SIZE2, SIZE2);
			con2.setLayout(new FlowLayout());
			con2.add(button2);
			con2.setBackground(Color.BLACK);
			button2.setBackground(Color.BLUE);
			button2.setForeground(Color.WHITE);
			button2.setMnemonic(KeyEvent.VK_M);
			button2.setActionCommand("go");
			button2.addActionListener(m -> Game.gameStart());
			
			//Sets the size color and if it works or not for the quit button
			setSize(SIZE3, SIZE3);
			con3.setLayout(new FlowLayout());
			con3.add(button3);
			con3.setBackground(Color.BLACK);
			button3.setBackground(Color.BLUE);
			button3.setForeground(Color.WHITE);
			button3.setMnemonic(KeyEvent.VK_E);
			button3.setActionCommand("stop");
			button3.addActionListener(e -> System.exit(0));
		}
		public static void main(String[] args)
		{
			Menu frame = new Menu();
			frame.setVisible(true);
		
		}
			
		
}

			
		
	


