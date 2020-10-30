public class ThreadMain{
    public static void main(String[] args) {

        new Thread(new Thread1()).start();
        for (int i = 0;i < 20;i++){
            System.out.println(Thread.currentThread().getName()+"执行"+i);
            }
        }
}

class Thread1 implements Runnable{
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "执行" + i);
        }
    }
}

class Thread2 extends Thread{

}


