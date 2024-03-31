package hw2;

public class hw2 {

	public static void main(String[] args) {

//	1.	請設計一隻Java程式，計算1～1000的偶數和(2+4+6+8+…+1000)
		int i = 0;
		for (int count = 0; count <= 1000; count++) {
			if (count % 2 == 0) {
				i = i + count;
			}
		}
		System.out.println(i);
		System.out.println();

//	2.  請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用for迴圈)
		int j = 1;
		for (int count = 1; count <= 10; count++) {
			j *= count;
		}
		System.out.println(j);
		System.out.println();

//	3.  請設計一隻Java程式，計算1～10的連乘積(1*2*3*…*10) (用while迴圈)
		int a = 1, count = 1;
		while (count <= 10) {
			a *= count;
			count++;
		}
		System.out.println(a);
		System.out.println();

//	4.  請設計一隻Java程式，輸出結果為以下：1 4 9 16 25 36 49 64 81 100
		for (int count2 = 1; count2 <= 10; count2++) {
			System.out.print(count2 * count2 + " ");
		}
		System.out.println("");
		System.out.println();

//	5.  阿文很熱衷大樂透(1 ～49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//		輸出結果為阿文可以選擇的數字有哪些？總共有幾個？
		int b = 0;
		for (int count3 = 1; count3 <= 49; count3++) {
			if (count3/10 != 4) {
				if(count3 % 10 != 4 ) {
				b++;
				System.out.print(count3+" ");
				}
			}
		}
		System.out.println();
		System.out.println(b);
		System.out.println();

//	6.  請設計一隻Java程式，輸出結果為以下：
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6 
//		1 2 3 4 5
//		1 2 3 4 
//		1 2 3 
//		1 2 
//		1

		for (int c = 10; c > 0; c--) {
			for (int count4 = 1; count4 <= c; count4++) {
				System.out.print(count4 + " ");
			}
			System.out.println();
		}System.out.println();
//	7.  請設計一隻Java程式，輸出結果為以下：
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
		int count5 = 65;
		for (int d = 1; d <= 6; d++) {
			for (int e = 1; e <= d; e++) {
				System.out.print((char)count5);
				}
			count5++;	
			System.out.println();

		}

	}

}
