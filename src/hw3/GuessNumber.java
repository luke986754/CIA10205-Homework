package hw3;

import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜囉: ");

		int j = (int) (Math.random() * 10);
		int i = sc.nextInt();
		
		while (i != j) {
			System.out.println("猜錯了");
			i = sc.nextInt();//重猜
		}
		System.out.println("答對了!答案就是 " + i);

	}
}
