package preparation;

import java.util.Scanner;

public class Threads {

    static int count;
    static int i=1;

    synchronized public void testFunc() throws InterruptedException {
        while (i <= count) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName()+":" + i);
                i++;
                notify();
            } else
                wait();
        }
    }


    synchronized public void testFunc1() throws InterruptedException {
        while (i <= count) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName()+":" + i);
                i++;
                notify();
            } else
                wait();
        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        Threads threads = new Threads();
        Thread t1 = new Thread(() -> {
            try {
                threads.testFunc();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        },"Even-Thread");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    threads.testFunc1();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        },"Odd-Thread");
        t1.start();
        t2.start();
    }

}