class AnotherRun implements Runnable {
	String runName;
	
	AnotherRun(String runName) {
		this.runName = runName;
	}
	
	/** Must override run() due to implement interface **/
	public void run() {
		// Execute your task
	}
}