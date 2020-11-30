public class SampleTest {
    public static void main(String[] args) {
        Sample sp = new Sample(1);
		Sample copy = sp.clone();
		System.out.println(sp == copy);
        doWork(copy,10);
		copy.debug();
        sp.debug();
    }

    public static void doWork(Sample s, int value) {
        s.change(value);
        //s.debug();
    }
}