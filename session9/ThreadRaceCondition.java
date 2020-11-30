package session9;

public class ThreadRaceCondition {
    private static int sharedData = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 0; i <= 5; i++)
                    readWriteData("T1", 1, 500);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 0; i <= 5; i++)
                    readWriteData("T2", 10, 900);
            }
        };
        // start multiple threads
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final value is " + sharedData);
    }

    public static void readWriteData(String tid, int increment, int delay) {
        //sharedData = sharedData + increment;

        int currValue = sharedData;
        int newValue = currValue + increment;
        System.out.printf("%s read: shared (%d) current (%d) new (%d)\n",
                tid, sharedData, currValue, newValue);
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.printf("%s write: shared (%d) current (%d) new (%d)\n",
                tid, sharedData, currValue, newValue);
        sharedData = newValue;
    }
}
