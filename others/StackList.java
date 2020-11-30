import java.util.Stack;

public class StackList {
	public static void main(String[] args) {
		Stack myStack = new Stack<>();
		
		for (int i=0; i<10; i++) {
			myStack.push(i);
		}
		
		while (!myStack.isEmpty()) 
			System.out.print(myStack.pop() + " ");
		System.out.println();
		
		for (int i=1 i<5; i++) {
			myStack.add(0,i)
		}
		
		while (!myStack.isEmpty())
			System.out.print(myStack.pop() + " ");
		System.out.println();
	}
}