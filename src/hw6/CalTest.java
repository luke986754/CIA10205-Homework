package hw6;

import java.util.Scanner;

public class CalTest {	
	
	public static void main(String[] args) {
		int x;
		int y;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入x值");
		x = sc.nextInt();
		System.out.println("請輸入y值");
		y = sc.nextInt();
		
		
		
		try {
		
		Calculator ca = new Calculator();
		ca.powerXY(x, y);
		} catch (CalException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
	}
}
