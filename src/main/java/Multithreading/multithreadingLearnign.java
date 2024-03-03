package Multithreading;

class MyThread2 implements Runnable{
    public void run(){
        while (1>0){
            System.out.println("This is my thread 2 running");
        }

    }
}
class MyThread extends Thread{

    public void run(){
         while (1>0){
             System.out.println("My Customer Thread class method running");
         }
    }

}

public class multithreadingLearnign {
    public static void main(String[] args) {
   Thread thread=new Thread(new MyThread());
   thread.start();

   Thread thread2=new Thread(new MyThread2());
   thread2.start();

   while (1>0){
       //Thread.sleep(5000);
       System.out.println("Main thread");
   }
    }
}
