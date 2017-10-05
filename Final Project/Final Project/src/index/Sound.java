package index;

import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import sun.audio.*;

public class Sound {

	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(200, 200);
		JButton button = new JButton("Click Me");
		frame.add(button);
		button.addActionListener(new AL());
		
	}
	
	public static class AL implements ActionListener {
		public final void actionPerformed(ActionEvent e) {
			Sound();
		}
	}

	public static void Sound()
	{
		AudioPlayer MGP = AudioPlayer.player;
		AudioStream BGM;
		AudioData MD;
		ContinuousAudioDataStream loop = null;
		
		try {
		BGM = new AudioStream(new FileInputStream(""));
		}
		
	}




}
