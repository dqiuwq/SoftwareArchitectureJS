class Main {
  public static void main(String[] args) {
    Buffer buf = new Buffer();
    buf.add(100);
    System.out.println(buf.getValue(0));

    buf = new BufferSub();
    buf.add(10);
    System.out.println(buf.getValue(0));

    //BufferSub bufSub = new BufferSub();
    //bufSub.add(200);
    //System.out.println(bufSub.getValue(0));
  }
}