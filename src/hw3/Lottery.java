package hw3;

import java.util.Scanner;

//阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//的號碼與總數，如圖：
public class Lottery {

	public static void main(String[] args) {
		System.out.println("阿文...請輸入你討厭哪個數字?(1-9)");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();

		// 抓可選的數字
		int count = 0;
		for (int i = 1; i <= 49; i++) {
			if (!((i >= 10 && i / 10 == k) || i % 10 == k)) {
				System.out.print(i + "  ");
				count++;
				if (count % 6 == 0) {
					System.out.println();
				}
			}
		}
		System.out.println("總共有 "+ count +" 個數字可選");
		
	}

}
