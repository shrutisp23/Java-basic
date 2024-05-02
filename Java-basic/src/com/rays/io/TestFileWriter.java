package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {
public static void main(String[] args) throws IOException {
	FileWriter file = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\hello.txt", true);
	file.write("How are you ?");
	file.close();
}
}
