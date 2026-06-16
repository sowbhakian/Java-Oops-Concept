package t.threadsClass;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

//ReentrantLock is preferred over synchronized when we need features like 
//tryLock, fairness, interruptible locking, or timeout-based lock acquisition.

public class LUserCashWithdraw {
	public static void main(String[] args) throws InterruptedException {

		User user1 = new User("001","Sowbhakian",1000);
		
		Thread t1 = new Thread(()->{
			System.out.println(user1.cashWithdraw(1000));
			System.out.println(user1.updateOtherBalance(100));
		});
		
		Thread t2 = new Thread(()->{
			System.out.println(user1.cashDeposit(500));
			System.out.println(user1.updateOtherBalance(100));
		});
		
		Thread t3 = new Thread(()->{
			System.out.println(user1.cashWithdraw(1000));
			System.out.println(user1.updateOtherBalance(100));
		});
		
		t1.start();
		t2.start();
		t3.start();
		t1.join();
		t2.join();
		t3.join();
		System.out.println("Balance : " + user1.getBalance());
		System.out.println("Balance : " + user1.getOtherBalance());
	}
}


class User{
	
	private final Object lockA = new Object();
	ReentrantLock lockB = new ReentrantLock();
	private String userId;
	private String userName;
	private int balance = 0;
	private int otherBalance = 0;

	User(String userId, String userName, int balance){
		this.userId = userId;
		this.userName = userName;
		this.balance = balance;
	}
	
	public int cashDeposit(int depositAmount) {
		synchronized (lockA) {			
			balance = balance + depositAmount;
		}
		return this.balance;
	}
	
	public int cashWithdraw(int withdrawAmount) {
		synchronized (lockA) {			
			balance = balance - withdrawAmount;
		}
		return this.balance;
	}
	
	public int  updateOtherBalance(int otherBalance) {
		lockB.lock();
		try {			
			this.otherBalance = this.otherBalance + otherBalance;
		}catch(Exception e) {
			e.getMessage();
		}finally {
			lockB.unlock();
		}
		return this.otherBalance;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public int getOtherBalance() {
		return otherBalance;
	}
	
}
