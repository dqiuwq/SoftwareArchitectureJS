package session6;

public class SampleTest {
    public static void main(String[] args) {
        Sample sp = new Sample(1);
        doWork(sp,10);
        sp.debug();
    }

    public static void doWork(Sample s, int value) {
        s.change(value);
        s.debug();
    }
}
