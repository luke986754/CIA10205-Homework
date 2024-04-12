package hw4;

public class task4 {
	public static void main(String[] args) {
		int[][] scoreArray = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };

		int count1 = 0, count2 = 0, count3 = 0, count4 = 0, count5 = 0, count6 = 0, count7 = 0, count8 = 0;
		int high = 0, a = 0, k;
		for (int i = 0; i < 6; i++) {
				for (k = 0; k < 8; k++) {

					if (scoreArray[i][k] > high) {
						high = scoreArray[i][k];
						a = k;
						}

						
					}
			
			
			if (a == 0) {
				count1++;
			}else if(a == 1) {
				count2++;
			}else if(a == 2) {
				count3++;
			}else if(a == 3) {
				count4++;
			}else if(a == 4) {
				count5++;
			}else if(a == 5) {
				count6++;
			}else if(a == 6) {
				count7++;
			}else if(a == 7) {
				count8++;	
			}
			
			high = 0;
			}
		
		System.out.println("1號同學" + count1);
		System.out.println("2號同學" + count2);
		System.out.println("3號同學" + count3);
		System.out.println("4號同學" + count4);
		System.out.println("5號同學" + count5);
		System.out.println("6號同學" + count6);
		System.out.println("7號同學" + count7);
		System.out.println("8號同學" + count8);

		}

//	

	
}
