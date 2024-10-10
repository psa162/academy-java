package com.bptn.course._18_java_threads;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		for(int i=0; i<5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	public static void main(String[] args) {
		//create an object of MyRunnable (class that implements the Runnable interface)
		MyRunnable myObj =new MyRunnable();
		
		Thread thread = new Thread(myObj);
		
		thread.start();
	

	}


}
//steps to create a thread using runnable interface
//create a class that implements runnable interface
//create an object of MyRunnable (class that implements the Runnable interface)
//create an object from the thread class and pass the object created in Step 2 into the constructor
//start the thread