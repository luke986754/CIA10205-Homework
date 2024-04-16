package hw5;

public class AuthCode {
	
	public void genAuthCode() {
		int[] codeArray = new int [62];
		
		
		for(int i = 0; i < codeArray.length; i++) {
			if(i < 10) {
				codeArray[i] = 48 + i;
			}else if(i < 36) {
				codeArray[i] = i + 55;
			}else {
				codeArray[i] = i + 61;
			}
		}
		
		
		for(int i = 0; i < 8; i++) {
			int j = 0;
			j = (int)(Math.random()*62);
			System.out.print((char)codeArray[j]);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		AuthCode ac = new AuthCode();
		ac.genAuthCode();
		
	}
	
	
}