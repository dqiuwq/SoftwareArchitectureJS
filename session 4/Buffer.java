public class Buffer {
  private int[] data;
  private int dIndex;

  public Buffer() {
    System.out.println("Buffer starts");
    initialise();
    System.out.println("Buffer ends");
  }

  private void initialise() { // change from public to private
    System.out.println("Buffer.initialise() called");
    data = new int[10];
  }

  public void add(int value) {
    data[dIndex++] = value;
  }

  public int getValue(int index) {
    return data[index];
  }
}