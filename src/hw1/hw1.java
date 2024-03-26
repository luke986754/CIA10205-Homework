
package hw1;

public class hw1 {
	public static void main(String[] args) {
//		1.請設計一隻Java程式，計算12，6這兩個數值的和與積
		int a = 12, b = 6;
		System.out.println(a+b);
		System.out.println(a*b);
		
//		2.請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
		int i,j;
		i = 200 / 12;
		j = 200 % 12;
		System.out.println("共"+i+"打"+j+"顆");
		
//		3.請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		int day,hr,min,sec;
		day = 256559 / (24 * 60 * 60);
		hr = (256559 / (60*60)) - (day * 24);
		min = (256559 / 60 ) - (day * 24 * 60 + hr * 60);
		sec = 256559 - day * 24 * 60 * 60 - hr * 60 * 60 - min * 60;
		System.out.println(day + "天" + hr +"小時" + min + "分" + sec + "秒");
//		4.請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長
		double PI = 3.1415;
		System.out.println("面積為" + 5 * 5 * PI);
		System.out.println("圓周長為" + 5 * 2 * PI);
//		5.某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//		金加利息共有多少錢 (用複利計算，公式請自行google)
		double r = .02;
		double deposit = 1500000;
		for(int t = 1; t <= 10; t++ ) {
			deposit *= (1+r);
		}
		System.out.println(deposit+"元");
		
//		6.請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//		5 + 5 ->10
//		5 + ‘5’ ->58
//		5 + “5” ->55
//		並請用註解各別說明答案的產生原因
		
		System.out.println(5 + 5);
//		因為2個5均為整數，故相加後得出整數10
		
		System.out.println(5 + '5');
//		因為第一個5為整數，第二個5為字元，對照Unicode編碼表橫軸為0030,縱軸為5，換算為十進位數為48+5=53，
//		故5 + 53 = 58
		
		System.out.println(5 + "5");
//		因為第一個5為整數，第二個5為字串，因字串位階高於整數，故兩者相加係為串接，得出結果亦為字串，故"5"+"5" = "55"
		
		
	}

}
