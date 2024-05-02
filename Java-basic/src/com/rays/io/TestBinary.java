package com.rays.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestBinary {
	public static void main(String[] args) throws IOException {
		FileInputStream in = new FileInputStream ("C:\\Users\\91930\\OneDrive\\Desktop\\images.jpg");
		FileOutputStream out = new FileOutputStream ("C:\\Users\\91930\\OneDrive\\Desktop\\image.jpg");
        int ch = in.read();
        while(ch!=-1) {
        	System.out.print((char)ch);
        	out.write(ch);
        	ch = in.read();
        	
        }
        out.close();
        in.close();
	
	}

}
