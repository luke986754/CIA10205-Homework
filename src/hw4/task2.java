package hw4;

import java.util.Scanner;

public class task2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入預借的金額: ");
		int bm = sc.nextInt();
		int count = 0;
		int[] empNo = new int[5];
		int[][] empMy = { { 25, 2500 }, { 32, 800 }, { 8, 500 }, { 19, 1000 }, { 27, 1200 } };
		System.out.print("有錢可借的員工編號: ");
		for (int i = 0; i < empMy.length; i++) {

			if (empMy[i][1] >= bm) {
				for (int k = 0; k < empMy.length; k++) {
					empNo[k] = empMy[i][0];
				}
				count++;
				System.out.print(empNo[0] + " ");
			}
		}

		System.out.print("  共" + count + "人!");
	}

}
