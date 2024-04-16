package hw6;

public class Calculator {
	
	private int x, y;
	
	public void powerXY(int x, int y) throws CalException {
	
		
		if (x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義");
		}else if(y < 0) {
			throw new CalException("次方為負數，結果無法回傳為整數型別");
			
		}else {
			this.x = x;
			this.y = y;
			int result = (int)Math.pow(x, y);
			System.out.println(x + "的" + y + "次方等於" + result);
		}
		
		
		
	}

	private boolean parseInt(int x) {
		
		return false;
	}

}
