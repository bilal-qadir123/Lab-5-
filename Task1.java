import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Task1 t1 = new Task1();
        t1.start();
        t1.interrupt();
    }
}

class Task1 extends Thread {
    public void run() {
        for (int i = 0; i < 26; i++) {
            int num = (int)(Math.random() * 26);
            char alpha = (char)('A' + num);
            try {
                sleep(500);
                System.out.println(Thread.currentThread().getName() + ": " + alpha);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
