package index;

import javax.swing.*;
import javax.swing.JOptionPane;
import FinalApplication.Game;

import java.awt.*;
import java.awt.event.*;

public class ButtonTesting extends JFrame {


		private final int SIZE = 180;
		private Container con = getContentPane();
		private JButton button = new JButton("Play");
		
		
		private final int SIZE1 = 180;
		private Container con1 = getContentPane();
		private JButton button1 = new JButton("Quit");
		
		
		public ButtonTesting()
		{
			setSize(SIZE, SIZE);
			con.setLayout(new FlowLayout());
			con.add(button);
			con.setBackground(Color.BLACK);
			button.setBackground(Color.BLUE);
			button.setForeground(Color.WHITE);
			button.setMnemonic(KeyEvent.VK_M);
			button.setActionCommand("go");
			button.addActionListener(m -> Game.gameStart());
			
			setSize(SIZE1, SIZE1);
			con1.setLayout(new FlowLayout());
			con1.add(button1);
			con1.setBackground(Color.BLACK);
			button1.setBackground(Color.BLUE);
			button1.setForeground(Color.WHITE);
			button1.setMnemonic(KeyEvent.VK_E);
			button1.setActionCommand("stop");
			button1.addActionListener(e -> System.exit(0));
		}
		public static void main(String[] args)
		{
			ButtonTesting frame = new ButtonTesting();
			frame.setVisible(true);
		
			}
		public void actionPerformed(ActionEvent M) {			}
		}

			
		
	


