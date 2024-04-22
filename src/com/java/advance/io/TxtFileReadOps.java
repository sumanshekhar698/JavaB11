package com.java.advance.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//nio package
public class TxtFileReadOps {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\sample.txt";

		// safety check
		File file = new File(path);
		if (file.exists())
			try (FileInputStream fis = new FileInputStream(file);) {

				int readChar;
				while ((readChar = fis.read()) != -1) {
					System.out.print((char)readChar);

				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
