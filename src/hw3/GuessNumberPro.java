package hw3;

import java.util.Scanner;

public class GuessNumberPro {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜囉: ");

		int j = (int) (Math.random() * 100);
		int i = sc.nextInt();//猜0~100的數字

		while (i != j) {
			if (i > j) {
				System.out.println("大於正確答案");
				i = sc.nextInt();// 重猜
			} else {
				System.out.println("小於正確答案");
				i = sc.nextInt();
			}
		}
		System.out.println("答對了!答案就是 " + i);

	}
}
