class Manager extends Employee {
	private String project;

	public Manager(String name, String department, String dateJoined, String project) {
		super(name, department, dateJoined);
		this.project = project;
		
		// or
		
		this.name = name;
		this.department = department;
		this.dateJoined = dateJoined;
		this.project = project;
	}

	public String getProject() {}
	public void setProject() {}

}