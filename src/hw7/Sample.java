package hw7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

//請寫一個程式讀取這個Sample.txt檔案，並輸出以下訊息：
//Sample.txt檔案共有xxx個位元組，yyy個字元，zzz列資料

public class Sample {
	
	public static void main(String[] Args){
		
		int countBit = 0, countByte = 0, countRow = 0;
		
		
		try {
			FileInputStream fis = new FileInputStream("C:\\javawork\\Sample.txt");
			FileReader fr = new FileReader("C:\\javawork\\Sample.txt");
			FileReader frr = new FileReader("C:\\javawork\\Sample.txt");
			BufferedReader br = new BufferedReader(frr);
			
			//位元組
			while((fis.read()) != -1) {
				countBit++;
				
			}

		
			//字元
			while((fr.read()) != -1) {
				br.mark(0);
				countByte++;
			}
			
			
			//列
			String str;
			while((str = br.readLine()) != null) {
				
				if(str.length() > 0) {
					countRow++;
				}
			
			
			}
			
			
			System.out.println("Sample.txt檔案共有"+ countBit + "個位元組，"+ countByte +"個字元，"+ countRow +"列資料");
			
			br.close();
			frr.close();
			fr.close();
			fis.close();
			
			
		}catch(IOException e){
			e.printStackTrace();			
		}
		

	}
}