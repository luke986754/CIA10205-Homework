package hw7;

import java.io.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Task2_2 {
	
	public static  void copyFile(File inputFile, File outputFile) throws IOException {
		
		
		FileInputStream fis = new FileInputStream(inputFile);
		FileOutputStream fos = new FileOutputStream(outputFile);
		
		int c;
		
		System.out.println("Copy");
		
		while((c = fis.read()) != -1){
			fos.write(c);
			System.out.flush();//避免有未傳輸的資料
		}
		
		System.out.println("Done");
	
	}
	
	
	public static void main(String[] args)throws IOException {
	
			//要複製的檔案
			File inputFile = new File("C:\\javawork\\Test.txt");
			
			//複製出來的新檔案
			File outputFile = new File("C:\\javawork\\TestCopy.txt");
			
			//呼叫copyFile方法，並傳送相關參數
			copyFile(inputFile, outputFile);
			
	} 
}
