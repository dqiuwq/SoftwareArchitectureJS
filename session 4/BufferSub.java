public class BufferSub extends Buffer {
  public BufferSub() {
    System.out.println("BufferSub() starts");
    initialise();
    System.out.println("BufferSub() ends");
  }

  private void initialise() {
    System.out.println("BufferSub.initialise called");
    // do more initialise work ..
  }
}