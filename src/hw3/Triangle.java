package hw3;

import java.util.Scanner;

public class Triangle {
	public void Triangle(int a,int b,int c){
		
		if (a + b <= c || a + c <= b || b + c <= a) {
			System.out.println("不是三角形");
		} else if (a == b && b == c) {
			System.out.println("正三角形");
		} else if (c*c == a*a+b*b || a*a == c*c + b*b|| b*b == c*c + a*a) {
			System.out.println("直角三角形");
		} else if (a == b || a == c || b == c) {
			System.out.println("等腰三角形");
		} else {
			System.out.println("其他三角形");
		}
	}

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入: ");
		
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		
		Triangle tri = new Triangle();
		tri.Triangle(a, b, c);
		
	}

}
