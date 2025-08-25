public class ThreadPriorityDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("LowPriorityThread");
        MyThread t2 = new MyThread("NormalPriorityThread");
        MyThread t3 = new MyThread("HighPriorityThread");

        // Set priorities
        t1.setPriority(Thread.MIN_PRIORITY);   // 1
        t2.setPriority(Thread.NORM_PRIORITY);  // 5
        t3.setPriority(Thread.MAX_PRIORITY);   // 10

        // Start threads
        t1.start();
        t2.start();
        t3.start();
    }
}

class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + 
                           " is running with priority " + 
                           Thread.currentThread().getPriority());
    }
}