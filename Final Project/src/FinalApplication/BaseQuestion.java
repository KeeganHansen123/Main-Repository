package FinalApplication;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class BaseQuestion extends JFrame{
	
	
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("Answer0");
	
	private final int SIZE1 = 180;
	private Container con1 = getContentPane();
	private JButton button1 = new JButton("Answer1");
	
	private final int SIZE2 = 180;
	private Container con2 = getContentPane();
	private JButton button2 = new JButton("Answer2");
	
	private final int SIZE3 = 180;
	private Container con3 = getContentPane();
	private JButton button3 = new JButton("Answer3");

	public BaseQuestion()
	{
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
		con.setBackground(Color.BLACK);
		button.setBackground(Color.BLUE);
		button.setForeground(Color.WHITE);
		button.setMnemonic(KeyEvent.VK_A);
		button.addActionListener(a -> JOptionPane.showMessageDialog(null, "-1"));
		
		setSize(SIZE1, SIZE1);
		con1.setLayout(new FlowLayout());
		con1.add(button1);
		con1.setBackground(Color.BLACK);
		button1.setBackground(Color.BLUE);
		button1.setForeground(Color.WHITE);
		button1.setMnemonic(KeyEvent.VK_B);
		button1.addActionListener(b -> JOptionPane.showMessageDialog(null, "-1"));
		
		setSize(SIZE2, SIZE2);
		con2.setLayout(new FlowLayout());
		con2.add(button2);
		con2.setBackground(Color.BLACK);
		button2.setBackground(Color.BLUE);
		button2.setForeground(Color.WHITE);
		button2.setMnemonic(KeyEvent.VK_C);
		button2.addActionListener(c -> JOptionPane.showMessageDialog(null, "-1"));
		
		setSize(SIZE3, SIZE3);
		con3.setLayout(new FlowLayout());
		con3.add(button3);
		con3.setBackground(Color.BLACK);
		button3.setBackground(Color.BLUE);
		button3.setForeground(Color.WHITE);
		button3.setMnemonic(KeyEvent.VK_D);
		button3.addActionListener(d -> JOptionPane.showMessageDialog(null, "How do I make it go to the next question?"));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseQuestion frame = new BaseQuestion();
		frame.setVisible(true);
		
		
		
		
		
	}

}