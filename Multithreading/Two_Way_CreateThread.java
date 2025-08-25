public class Two_Way_CreateThread {
    public static void main(String args[]){
        Thread t1=new Thread(new MyTask());
        t1.start();
    }
}

class MyTask implements Runnable{
    public void run(){
        System.out.println("Thread is running...");
    }
}