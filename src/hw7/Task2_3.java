package hw7;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Task2_3 {
	
//	請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。
//	注意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
	
	
	public static void main(String[] args) throws Exception {
		

			//建立目錄物件
			File dir = new File("c:\\data");     

			if (!dir.exists()) {
				dir.mkdir();
			}
			
			//建立Object路徑
			File myFile = new File("C:\\data\\Object.ser");
			
			
			Animal[] ani = new Animal[4];
			ani[0] = new Dog("Bob");
			ani[1] = new Dog("Zac");
			ani[2] = new Cat("Joanne");
			ani[3] = new Cat("Jake");
			

			
			FileOutputStream fos = new FileOutputStream(myFile);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
		
			for(int i = 0; i < ani.length; i++) {
				oos.writeObject(ani[i]);
			}
		
			
			
			
//			• 承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何(請利用多
//			型簡化本題的程式設計)	
			
			try {
				FileInputStream fis = new FileInputStream(myFile);
				ObjectInputStream ois = new ObjectInputStream(fis);
				while(true) {
					((Animal)ois.readObject()).speak();
					System.out.println("--------------------");	
				}
				
				
			}catch(EOFException e){
				
				System.err.println("資料讀取完畢！");
				
			}
			

			oos.close();
			fos.close();

			
			

	}
	

}
