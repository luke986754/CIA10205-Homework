package hw4;

public class task1 {
	public static void main(String[] args) {
//		有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
		int[] Array = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		double sum = 0, avg = 0;
		for (int i = 0; i < Array.length;) {
			sum += Array[i];
			i++;
			avg = sum / i;
		}
		System.out.println(avg);
		for (int j = 0; j < Array.length; j++) {
			if (Array[j] > avg) {
				System.out.print(Array[j] + " ");
			}
		}
		System.out.println();
//		請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		String s = "Hi Everyone";
		for (int k = (s.length() - 1); k >= 0; k--) {
			System.out.print(s.charAt(k) + "");
		}
		System.out.println();

//		有個字串陣列如下(八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u) 
//		(提示：字元比對，String方法)		
		String[] planets = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
//		System.out.print(planets[1].charAt(2));

		int a = 0, e = 0, i = 0, o = 0,u = 0;
		for (int j = 0; j < planets.length; j++) {
			for (int k = 0; k < planets[j].length(); k++) {
				char planets_vo = planets[j].charAt(k);
				if (planets_vo == 'a') {
					a++;
				}
				if (planets_vo == 'e') {
					e++;
				}
				if (planets_vo == 'i') {
					i++;
				}
				if (planets_vo == 'o') {
					o++;
				}
				if (planets_vo == 'u') {
					u++;
				}

			}
		}

		System.out.println("a有"+ a +"個");
		System.out.println("e有"+ e +"個");
		System.out.println("i有"+ i +"個");
		System.out.println("o有"+ o +"個");
		System.out.println("u有"+ u +"個");
	}

}
