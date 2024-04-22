package com.java.advance.io;

import java.io.File;
import java.io.IOException;

public class FileInfoOperation2 {

	public static void main(String[] args) {
//		String path ="C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\sample.txt";
		String path2 ="C:\\Users\\suman\\eclipse-workspace\\JavaB11\\notes\\test.txt";

		
		File file = new File(path2);
		if(file.exists()) {
			System.out.println("File is there !!");
			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
			System.out.println(file.getPath());
			System.out.println(file.getName());
			System.out.println(file.canRead());
			System.out.println(file.canWrite());
			file.delete();
//			CMD Terminal Powershell
			//mkdir is to vreate dir
			//touch for files


		}else {
			System.out.println("No File!!");
//			file.delete();
				try {
					file.createNewFile();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
	
		

		

	}

}
