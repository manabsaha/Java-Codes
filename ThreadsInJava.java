//package test;
//By extending the Thread class.
class A extends Thread {
	
	//override
	public void run() {
		
		for(int i =1; i<=5;i++) {
			System.out.println("THREAD 1 :  "+ i);
		}
	}
}

class B extends Thread {
	
	//override
	public void run() {
		
		for(int i =1; i<=5;i++) {
			System.out.println("THREAD 2 :  "+ i);
		}
	}
}

class C extends Thread {
	
	//override
	public void run() {
		
		for(int i =1; i<=5;i++) {
			System.out.println("THREAD 3 :  "+ i);
		}
	}
}

public class ThreadsInJava {

	public static void main(String[] args) {

		A obj1 = new A();
		B obj2 = new B();
		C obj3 = new C();
		obj1.start();
		obj2.start();
		obj3.start();
	}

}
