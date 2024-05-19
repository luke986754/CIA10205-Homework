package hw9;

public class Task1 extends Thread {
	
//	 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//	 競賽過程。
//	 • 每個動作都以Thread.sleep()暫停一下,以達到顯示效果。
//	 Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示
//	 • 參考範例：CounterRunnable.java
//	  • 需留意主執行緒執行順序
	int counter = 0;
	String name;
	
	public Task1(String name) {
		super(name);
	}
	
	public void run() {
		
		for(int i = 0; i < 10 ; i++) {
		counter++;
		System.out.println(getName() + "吃第" + counter + "碗飯");
		}
		System.out.println(getName() + "吃完了");
		try {
			Thread.sleep((long)(Math.random()*2501 + 500));
		} catch (Exception e) {
			
		}
	}
		
	public static void main(String[] args) {
		Task1 manto = new Task1("饅頭人");
		Task1 james = new Task1("詹姆士");
		
		System.out.println("----------大胃王比賽開始---------");
		manto.start();
		james.start();
		
		try {
			manto.join();
			james.join();
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("----------大胃王比賽結束---------");
	
	}

}
