package hw5;

public class Task1b {
	
	// 請設計一個方法為randAvg()，從10個0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	
	public void randAvg() {
		double sum = 0;
		int[] rm = new int[10];
		
		for(int i = 0; i < rm.length; i++) {
			
			rm[i] = (int)( Math.random()*100);
			System.out.print(rm[i] + " ");
			sum = sum + rm[i];
		}
	System.out.println();	
	System.out.print("平均值為" + (sum / 10));
	}
	
	public static void main(String[] args) {
		
		Task1b num = new Task1b();
		num.randAvg();
		
	}

}
