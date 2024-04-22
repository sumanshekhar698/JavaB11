package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainDeserailazation {

	public static void main(String[] args) {
//		Student st1 = new Student(32, 100, "John", false);
//		System.out.println(st1);

		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\sample.txt";
		File file = new File(path);
		if (file.exists()) {
			try {
				FileInputStream fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				Student st1 = (Student) ois.readObject();
				System.out.println(st1);

			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
