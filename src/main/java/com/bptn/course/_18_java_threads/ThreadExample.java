package com.bptn.course._18_java_threads;

public class ThreadExample extends Thread {
	
	public ThreadExample (String name) {
		super(name);
	}
	
	@Override
	public void run() {
		
		for (int i=0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
		}
	}

	public static void main(String[] args) {
		
		//create an example from Thread Example
		ThreadExample t1 =  new ThreadExample("Thread 1");
		ThreadExample t2 =  new ThreadExample("Thread 2");
		
		//start both thread
		System.out.println(t1.getState());
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
			
			e.printStackTrace();
		}

	
	
	}

}
