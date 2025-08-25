public class Real_WorldExample {
    public static void main(String args[]){
        DownloadingSong d1=new DownloadingSong();
        PlayingSong p1=new PlayingSong();
        d1.start();
        p1.start();
    }
}

class DownloadingSong extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
            System.out.println("Downloading part:"+i);
        }
    }
}
class PlayingSong extends Thread{
    public void run(){
        for(int i=1;i<5;i++){
        System.out.println("Playing Part:"+i);
    }
    }
}