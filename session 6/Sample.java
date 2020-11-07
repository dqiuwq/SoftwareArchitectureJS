package session6;

public class Sample
{
  private int[] data = new int[5];
  private Square sq;
  public Sample(int value)
  {
    sq = new Square(value);
  }
 
  public void change(int value)
  {
    for (int i = 0; i < data.length; i++)
      data[i] = value;
    sq.setLength(value);
  }
  public void debug()
  {
    System.out.print("Array: ");
    for (int value : data)
      System.out.print(value + " ");
    System.out.println("\n" + sq);
  }
}