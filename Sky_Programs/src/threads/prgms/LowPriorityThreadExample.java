package threads.prgms;

public class LowPriorityThreadExample {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Low Priority Thread: " + i);
            }
        });

        t1.setPriority(Thread.MIN_PRIORITY); // Priority = 1
       // t1.setPriority(Thread.MAX_PRIORITY);------->these line decides
        t1.start();

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Normal Priority Thread: " + i);
            }
        });

        t2.setPriority(Thread.NORM_PRIORITY); // Priority = 5
        t2.start();
    }
}

