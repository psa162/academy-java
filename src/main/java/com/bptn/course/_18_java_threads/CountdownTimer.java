package com.bptn.course._18_java_threads;

public class CountdownTimer implements Runnable {

	private int startValue;

	public CountdownTimer(int startValue) {

		// assign the startValue parameter to the instance variable
		this.startValue = startValue;
	}

	@Override
	public void run() {
		
		for (int i = startValue; i >= 1; i--) {
			// print the current count

			System.out.println(i);

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		 // Step 1: Create a new CountdownTimer object with a start value of 10
        CountdownTimer countdownTimer = new CountdownTimer(10);

        // Create a new Thread object, passing the countdownTimer object as the Runnable target
        Thread thread = new Thread(countdownTimer);

        // Start the thread by calling the start() method
        thread.start();
        
        try {
			thread.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        System.out.println("Main thread continues to execute...");
    }
}