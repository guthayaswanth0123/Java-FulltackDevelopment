
// class MyThread extends Thread{
//     @Override
//     public void run(){
//         System.out.println("Thread is running.....");
//     }
// }


class MyThread implements Runnable{
    @Override
    public void run(){
        System.out.println("Thread is running...");
    }
}


public class ThreadCreation {
    public static void main(String[] args){
        // MyThread td=new MyThread();
        // td.run(); //it do not create a new thread
        // //td.start(); //it will cretae a new thread inside that thread run will execute



        MyThread td=new MyThread();
        Thread t=new Thread(td);
        t.start();
    }
}
