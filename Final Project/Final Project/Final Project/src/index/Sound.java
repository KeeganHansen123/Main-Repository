package index;

import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.JOptionPane;

	public class Sound {

		public static void main(String[] args) throws Exception 
		{
			URL url = new URL("http://www.wavsource.com/snds_2017-09-17_1751672946049674/sfx/boo.wav");
			AudioClip clip = Applet.newAudioClip(url);
			AudioClip clip2 = Applet.newAudioClip(url);
			clip.play();
			Thread.sleep(1000);
			clip2.loop();
			Thread.sleep(20000);
			clip2.stop();
			
			JOptionPane.showMessageDialog(null, "End");
		}
		
}
