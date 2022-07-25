package Ojt_test;

import java.io.*;

public class Day5_FileOutputStream {

	public static void main(String[] args) 
			 throws IOException
	{
		// TODO Auto-generated method stub
		// Attaching the file to FileInputStream
		// Attaching the file to FileInputStream
        FileInputStream fin = new FileInputStream("file.txt");
 
        // Illustrating getChannel() method
        System.out.println(fin.getChannel());
 
        // Illustrating getFD() method
        System.out.println(fin.getFD());
 
        // Illustrating available method
        System.out.println("Number of remaining bytes:"
                           + fin.available());
 
        // Illustrating skip() method
        fin.skip(4);
 
        // Display message for better readability
        System.out.println("FileContents :");
 
        // Reading characters from FileInputStream
        // and write them
        int ch;
 
        // Holds true till there is data inside file
        while ((ch = fin.read()) != -1)
            System.out.print((char)ch);
 
        // Close the file connections
        // using close() method
        fin.close();
	}

}
