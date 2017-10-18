package BradensHighScoreTesting;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


import javax.swing.JOptionPane;

public class Score {
		
		
		
	public static void main(String[] args) throws FileNotFoundException {
		
		int Score = 500;
		int ScoreFinal = 0;
		do {
			ScoreFinal = Score - 10;
			String.valueOf(ScoreFinal);
			
			try(  PrintWriter out = new PrintWriter( "Score.txt" )  ){
			    out.println(ScoreFinal);
			
			// The name of the file to open.
	        String fileName = "Score.txt";

	        // This will reference one line at a time
	        String line = null;

	        try {
	            // FileReader reads text files in the default encoding.
	            FileReader fileReader = 
	                new FileReader(fileName);

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader = 
	                new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                JOptionPane.showMessageDialog(null, line);
	            }   

	            // Always close files.
	            bufferedReader.close();         
	        }
	        catch(FileNotFoundException ex) {
	            JOptionPane.showMessageDialog(null, 
	                "Unable to open file '" + 
	                fileName + "'");                
	        }
	        catch(IOException ex) {
	            JOptionPane.showMessageDialog(null, 
	                "Error reading file '" 
	                + fileName + "'");                  
	            // Or we could just do this: 
	            // ex.printStackTrace();
	}
}
	} while(ScoreFinal != 0);

	}
}

		
	


