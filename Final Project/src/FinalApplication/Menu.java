package FinalApplication;

import javax.swing.*;

import index.ButtonTesting;

import java.awt.*;
import java.awt.event.*;
public class Menu extends JFrame {
	
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("Play");
	
	private final int SIZE1 = 180;
	private Container con1 = getContentPane();
	private JButton button1 = new JButton("Quit");
	
	public Menu() 
	{
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.setBackground(Color.BLACK);
		button.setBackground(Color.BLUE);
		button.setForeground(Color.WHITE);
		
		setSize(SIZE1, SIZE1);
		con1.setLayout(new FlowLayout());
		con1.add(button1);
		con1.setBackground(Color.BLACK);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		
	}


	public void actionPerformed(ActionEvent event, AbstractButton mAnswer)
	{	
		int value, total;;
		Object cause = event.getSource();
		if(cause == button1)
		{
			mAnswer.setText("click");
		}
	}
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu frame = new Menu();
		frame.setVisible(true);

	}

}
