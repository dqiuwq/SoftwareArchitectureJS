import java.util.Stack;
public class StackListRaw
{
  public static void main(String[] argv)
  {
    Stack myStack = new Stack<>();
    for (int i = 10; i <= 20; i++)
      myStack.push(i);
    while (!myStack.isEmpty())
    {
      System.out.print(myStack.pop() + " ");
    }
    System.out.println();
    for (int i = 1; i <= 10; i++)
      myStack.add(0, i);
    while (!myStack.isEmpty())
    {
      System.out.print(myStack.pop() + " ");
    }
 
}