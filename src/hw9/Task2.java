package hw9;

//	熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//	錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//	3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//	以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//	大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//	已經入帳戶。假設媽媽一次匯款2000 元,熊大一次提款
//	1000元,寫一個Java程式模擬匯款10次與提款10次的情
//	形。

class Account {
	private int saving = 0;

	synchronized public void deposit(int money) {
		while (saving >= 3000) {
			System.out.println("媽媽看到帳戶超過3000，暫停匯款");
			try {
				wait();
			} catch (InterruptedException e) {
				//main方法呼叫媽媽執行緒的interrupt()，代表wait被中斷而觸發例外
				System.err.println("媽媽結束匯款");
				// 結束該次方法執行
				return;
			}
			System.out.println("媽媽被熊大請求支援");
		}

		saving += money;
		System.out.println("媽媽存入:" + money + "，帳戶共有:" + saving);
		notify();
	}

	synchronized public void withdraw(int money) {
		while (saving < money) {
			System.out.println("熊大看到帳戶沒錢暫停提款");
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("熊大被媽媽告知帳戶已經有錢!");
		}
		
		saving -= money;
		System.out.println("熊大領了" + money + "，帳戶共有" + saving);
		if (saving <= 2000) {
			System.out.println("熊大看到帳戶低於2000，請求匯款");
			notify();
		}

	}

}

class MomBear implements Runnable {
	private Account account;

	public MomBear(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.deposit(2000);
		}

	}

}

class Bear implements Runnable{
	public static boolean isFinished = false;
	private Account account;

	public Bear(Account account) {
		this.account = account;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			account.withdraw(1000);
		}
		
		isFinished = true;
	}

}

public class Task2 {

	public static void main(String[] args) {
		Account account = new Account();
		MomBear mombear = new MomBear(account);
		Bear bear = new Bear(account);
		Thread mom = new Thread(mombear);
		Thread son = new Thread(bear);

		mom.start();
		son.start();
		
		while(true) {
			// 熊大執行緒跑完且媽媽還在就中斷wait
			if(bear.isFinished && mom.isAlive()) {
				mom.interrupt();
			}
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
			//執行緒都結束了
			if(bear.isFinished && !mom.isAlive()) {
				break;
			}
		}

		
	}

}
