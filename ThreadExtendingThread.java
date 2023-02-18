class MyThread1 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Hello i am cooking");
            System.out.println("Ohh soo hot pancakes!!");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<1800){
            System.out.println("Hello i am chatting");
            System.out.println("Ohh soo much unread messages!!");
            i++;
        }
    }
}
public class ThreadExtendingThread {
    public static void main(String[] args) {
        MyThread1 a= new MyThread1();
        MyThread2 b= new MyThread2();
        // a.run();
        // b.run();
        a.start();
        b.start();
    }
}
