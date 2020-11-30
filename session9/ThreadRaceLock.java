package session9;

public class ThreadRaceLock {
    private static String ticket = ""; // for block code sync
    private static int sharedData = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++)
                    readWriteData("T1", 1, 500);
            }
        };

        Thread t2 = new Thread() {
            public void run() {
                for (int i = 1; i <= 5; i++)
                    readWriteData("T2", 10, 500);
            }
        };
        // start multiple threads
        t1.setPriority(1);
        t1.setPriority(5);
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

    /** synchronize entire method **/
    /*public static synchronized void readWriteData(String tid, int increment, int delay) {
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
    }*/

    /** block code synchronize **/
    public static void readWriteData(String tid, int increment, int delay) {
        // other statements
        synchronized (ticket) { // value of ticket does matter
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
        // other statements
    }
}
