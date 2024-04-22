package com.java.advance.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TxtWriteFileOps {

	public static void main(String[] args) {

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\sample.txt";

		String msg = "Java was easy \nif you pratcice it\n\n\n\n";

		// safety check
		File file = new File(path);
		if (file.exists())
			try (FileOutputStream fos = new FileOutputStream(file);) {
				fos.write(msg.getBytes());

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
