class SimpleRun implements Runnable {
	String runName;
	
	SimpleRun(String runName) {
		this.runName = runName;
	}
	
	/** Must override run() due to implement interface **/
	public void run() {
		// Execute your task
	}
	
	public static void main(String[] args) {
		SimpleRun sr = new SimpleRun("MyThread");
		new Thread(sr).start(); 
		// Because the class is not a subclass of Thread
		// hence, we have to create a Thread instance explicitly
	}
}