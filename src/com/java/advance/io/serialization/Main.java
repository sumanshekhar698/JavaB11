package com.java.advance.io.serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		Student st1 = new Student(32, 100, "John", false);
		System.out.println(st1);
		
		String path = "C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\sample.txt";
		File file = new File(path);
		if(file.exists()) {
			try {
				FileOutputStream fos= new FileOutputStream(file);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(st1);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		

	}

}
