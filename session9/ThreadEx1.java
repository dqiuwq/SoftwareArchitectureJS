package session9;

public class ThreadEx1 {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                doWork("T1", 1);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                doWork("T2", -1);
            }
        };
        // sequential example
        //t1.run();
        //t2.run();
        // asynchronous example
        t1.start(); // similar to fork() in c
        t2.start();
        System.out.println("End of main");
        // main will fork() twice
        // main ends first
        // followed by t1 and t2 running asynchronously
    }

    public static void doWork(String tid, int increment) {
        long value = 0;
        int count = 0;
        int limit = 1000000;
        while (true) {
            count++;
            if (count == limit) {
                value += increment;
                System.out.printf("%s : %d\n", tid, value);
                count = 0;
            }

            if (Math.abs(value) == 10)
                break;
        }
    }
}
