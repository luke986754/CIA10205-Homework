package hw4;

import java.util.Scanner;

public class task3 {
	public static void main(String[] args) {
		int yr, month, day;
		int count = 0;
		int[] mm = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
		int[] dd = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] dd_lyr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入西元年(yyyy): ");
		yr = sc.nextInt();
		System.out.println("請輸入月: ");
		month = sc.nextInt();
		System.out.println("請輸入日: ");
		day = sc.nextInt();
		
		if (yr % 4 == 0 && yr % 100 != 0 || yr % 400 == 0) {
		//若YEAR為閏年
				
			int i = 0;
			//month-1月
			for(; mm[i] < month; i++) {
				count = count + dd_lyr[i];
			}

			if(month == 2 && (day > 29 || day <= 0)) {
					System.out.println("輸入錯誤，請重新輸入");
			}else if(month != 2 && (day > dd_lyr[i] || day <= 0)) {
					System.out.println("輸入錯誤，請重新輸入");
			}else {
				//最後一月
				count = count + day;
				System.out.print("輸入的日期為該年第 " + count + "天");
			
			}
	
		}
		else {
		//非閏年
			int i = 0;
			//month-1月
			for(; mm[i] < month; i++) {
				count = count + dd[i];
			}

			if(month == 2 && (day > 28 || day <= 0)) {
					System.out.println("輸入錯誤，請重新輸入");
			}else if(month != 2 && (day > dd[i] || day <= 0)) {
					System.out.println("輸入錯誤，請重新輸入");
			}else {
				//最後一月
				count = count + day;
				System.out.print("輸入的日期為該年第 " + count + "天");
			
			}

		}

	
	}
			

}

