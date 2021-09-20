package differentSort;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//condition的优势在于可以加条件
//lock实现4个人的生产者 消费者

public class AJUC {
    public static void main(String[] args) {
        Data2 data = new Data2();

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
        },"C").start();

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
        },"D").start();
    }
}

class Data2{

    private  int number = 0;

    Lock lock = new ReentrantLock();
    Condition con = lock.newCondition();

    public void increment() throws InterruptedException {
        lock.lock();
        try{
            while(number !=0 ){
                con.await();
            }
            number ++ ;
            System.out.println(Thread.currentThread().getName()+"=>" + number);
            con.signalAll();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void decrement() throws InterruptedException{
        lock.lock();
        try{
            while(number == 0){
                con.await();
            }
            number --;
            System.out.println(Thread.currentThread().getName()+"=>" + number);
            con.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
