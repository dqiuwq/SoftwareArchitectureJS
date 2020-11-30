package session9;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class ThreadEx2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        while (true) {
            System.out.println("\na-Simple work\nb-Heavy work\nc-Multithreading\nq-quit");
            System.out.print("choose an option: ");
            String option = kb.nextLine();
            if (option.equalsIgnoreCase("a"))
                doSimpleWork();
            else if (option.equalsIgnoreCase("b"))
                doHeavyWork();
            else if (option.equalsIgnoreCase("c"))
                doMultithreading();
            else if (option.equalsIgnoreCase("q"))
                break;
        }
        System.out.println("end of program");
    }

    public static void doSimpleWork() {
        System.out.println("simple work start");
        // do something
        System.out.println("simple work end");
    }

    public static void doHeavyWork() {
        System.out.println("heavy work start");
        for (int i=1; i<=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("heavy work end");
    }

    public static void doMultithreading() {
        Thread t = new Thread() {
            public void run() {
                doHeavyWork();
            }
        };
        System.out.println("starting thread.....");
        t.start();
        System.out.println("multithreading returning.....");
    }
}
