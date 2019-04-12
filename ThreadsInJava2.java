//package test;
//Using Runnable interface.

class X implements Runnable{
	
	//implements
	public void run() {
		
		for(int i =1; i<=10;i++) {
			System.out.println("THREAD 1 :  "+ i);
		}
	}
}

class Y implements Runnable{
	
	//implements
	public void run() {
		
		for(int i =1; i<=10;i++) {
			System.out.println("THREAD 2 :  "+ i);
		}
	}
}

public class ThreadsInJava2 {

	public static void main(String[] args) {
		
		Thread obj1 = new Thread(new X());
		Thread obj2 = new Thread(new Y());
		obj1.start();
		obj2.start();
	}

}
