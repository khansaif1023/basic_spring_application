package Multithreading;

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

   while (1>0){
       System.out.println("Main thread");
   }
    }
}
