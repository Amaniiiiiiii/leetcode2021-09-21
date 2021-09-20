package differentSort;

public class A {
    //普通生产者消费者
    public static void main(String[] args) {
        Data data = new Data();

        new Thread(new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        data.increment();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"A").start();

        new Thread(new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    try {
                        data.decrement();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        },"B").start();

    }
}

class Data{

    private  int number = 0;

    public synchronized void increment() throws InterruptedException {
        while(number !=0 ){
            this.wait();
        }
        number ++ ;
        System.out.println(Thread.currentThread().getName()+"=>" + number);
        this.notifyAll();
    }

    public synchronized void decrement() throws InterruptedException{
        while(number == 0){
            this.wait();
        }
        number --;
        System.out.println(Thread.currentThread().getName()+"=>" + number);
        this.notifyAll();
    }
}
