package hw5;

public class Task2 {
	int maxNum = 0;
	double maxNum2 = 0.0;
	
	//int陣列的最大值
	public int maxElement(int[][] x) {
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				     int a = x[i][j];
				
				if(a > maxNum) {
					maxNum = a;
				}
				
			}
			
		}
		return maxNum;
		
	}
	
	//double 陣列的最大值
	public double maxElement(double[][] x) {
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				     double b = x[i][j];
				
				if(b > maxNum2) {
					maxNum2 = b;
				}
				
			}
			
		}
		return maxNum2;
	}
	
	public static void main(String[] args) {
		int [][] intArray = {{1, 6, 3},
					  		 {9, 5, 2}};
		double [][] doubleArray = {{1.2, 3.5, 2.2},
				  		 		   {7.4, 2.1, 8.2}};
		
		Task2 t = new Task2();
		
		//找出兩陣列最大值
		System.out.println(t.maxElement(intArray));
		System.out.println(t.maxElement(doubleArray));
		
	}
	

}
