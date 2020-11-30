class SimpleThread extends Thread {
	String threadName;
	
	SimpleThread(String threadName) {
		this.threadName = threadName;
	}
	
	/** Must override the run method **/
	public void run() {
		// Execute your task
	}
	
	public static void main(String[] args) {
		SimpleThread st = new SimpleThread("MyThread");
		st.start(); 
		// Because it is a subclass of Thread, it has access to start()
	}
}