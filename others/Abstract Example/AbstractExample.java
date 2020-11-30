abstract class Person {
	String name;
	final void printName() {
		System.out.println("My name is "+name);
	}
	abstract void sayHello();
}

