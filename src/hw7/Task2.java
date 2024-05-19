package hw7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Task2 {
	
	public static void main(String[] args) {
//	  1.請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡(請使用
//		append功能讓每次執行結果都能被保存起來)
		
		try {
				FileOutputStream data = new FileOutputStream("c:\\javawork\\Data.txt", true);
				PrintStream ps = new PrintStream(data);
				
				
				for(int i = 0; i < 10; i++) {
					
					int num;
					num = (int)(Math.random() * 1000) + 1;
					ps.print(num + " ");
				}
				ps.println();
				ps.close();
				data.close();
			
			}catch(IOException e){
				e.printStackTrace();
			}
		
		
	}

}
