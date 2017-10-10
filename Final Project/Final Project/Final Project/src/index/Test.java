package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.io.*;
class Test extends JFrame implements ActionListener
{
  String home = System.getProperty("user.home");
  JButton btn = new JButton("Play Sound");
  File wavFile = new File(home + "/Downloads/worlds-smallest-violin.mp3");
  AudioClip sound;
  @SuppressWarnings("deprecation")
public Test()
  {
    setSize(300,100);
    setLocation(400,300);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    JPanel jp = new JPanel();
    btn.addActionListener(this);
    jp.add(btn);
    getContentPane().add(jp);
    pack();
    try{sound = Applet.newAudioClip(wavFile.toURL());}
    catch(Exception e){e.printStackTrace();}
  }
  public void actionPerformed(ActionEvent ae){sound.play();}
  public static void main(String args[]){new Test().setVisible(true);}
}
//c:\\Windows\\media\\ding.wav