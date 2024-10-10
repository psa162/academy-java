package com.bptn.course._18_java_threads;


class A extends Thread {
	@Override
	public void run() {
	
	for (int i=0; i<100; i++) {
		
		System.out.println("Hi java");
	}
	
	
}
}

class B extends Thread {
	public void run() {
	
	
	for (int i=0; i<100; i++) {
		
		System.out.println("Hello java");
	}
	}
	
}
public class Mythreads {

	public static void main(String[] args) {
		
	//create an object
		A myObj = new A();
        B myObj1 = new B();

        // Call methods sequentially
        myObj.start();
        myObj1.start();
	}

}
//major takeaway
//class A and B are runnning with the main thread and hence it is not executed at separate thread
//Class A and B are extending thread class
//the start[] method executes its as a separate method
// its not recommended to call the run method directly because it runs with the context of the main thread




