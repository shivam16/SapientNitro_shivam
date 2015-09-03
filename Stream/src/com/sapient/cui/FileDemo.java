package com.sapient.cui;

import java.io.File;
 

public class FileDemo {
	static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String args[]) {
		File f1= new java.io.File("D:/sapient");
		p("File Name: " + f1.getName());
		p("Path: "+ f1.getPath());
		p("Abs Path: "+ f1.getAbsolutePath());
		p("Parent: "+ f1.getParent());
		p(f1.exists()? "exists":"does not exist");
		p(f1.canWrite()? "is writtable":"is not writtable");
		p(f1.canRead()? "is readable":"is not readable");
		p("is "+(f1.isDirectory()? "":"not")+" a directory");
		p(f1.isAbsolute()? "is absolute":"is not absolute");
		p("File last modified: " + f1.lastModified());
		p("File size: "+ f1.length()+ "Bytes");
		p(f1.isFile() ? "is normal file":"mightr be a named pipe");
	}
}
