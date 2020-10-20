
public class ProducerConsumerTest {
    public static void main(String[] args) {
        CubbyHole c = new CubbyHole();
        Producer p1 = new Producer(c,1);
        Consumer c1 = new Consumer(c,2);
        p1.start();
        c1.start();
    }
}

class CubbyHole{
    private int content;
    private boolean available = false;
    public synchronized int get(){
        while (!available){
            try {
                wait();
            }
            catch (InterruptedException e){
            }
        }
        available = false;
        notifyAll();
        return content;
    }
    public synchronized void put(int value){
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        content = value;
        available = true;
        notifyAll();
        }
}

class Consumer extends Thread{
    private CubbyHole cubbyHole;
    private int number;
    public Consumer(CubbyHole c, int number){
        cubbyHole = c;
        this.number = number;
    }
    public void run(){
        for (int i = 0;i<10;i++){
            int value = cubbyHole.get();
            System.out.println("消费者 #"+ this.number + " got " + value);
        }
    }
}

class Producer extends Thread{
    private CubbyHole cubbyHole;
    private int number;
    public Producer(CubbyHole c,int number){
        cubbyHole = c;
        this.number = number;
    }
    public void run(){
        for (int i =0;i<10;i++){
            cubbyHole.put(i);
            System.out.println("生产者 #" + this.number + " put " + i);
            try {
                sleep((long)(Math.random()*1000));
            }catch (InterruptedException e){}
        }
    }
}
