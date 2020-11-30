class Person {

	private String name;
	private Date birthday;

	public Person(String name, Date birthday) {}
	public String getName() {}
	public Date getBirthday() {}

	public void setName(String name) {}
	public void setBirthday(Date birthday) {}
	public void setBirthday(String day, String month, String year) {
		this.birthday = new Date(day, month, year);
	}
}


