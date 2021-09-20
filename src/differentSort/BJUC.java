package differentSort;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//多个lock锁的

public class BJUC {
    public static void main(String[] args) {
        Data3 data = new Data3();

        new Thread(new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    data.Afonction();
                }
            }
        },"A").start();

        new Thread(new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    data.Bfunction();
                }
            }
        },"B").start();

        new Thread(new Thread(){
            public void run(){
                for (int i = 0; i < 10; i++) {
                    data.Cfunction();
                }
            }
        },"C").start();
    }
}

class Data3{

    private  int number = 1;// 1A 2B 3C

    Lock lock = new ReentrantLock();
    Condition con1 = lock.newCondition();
    Condition con2 = lock.newCondition();
    Condition con3 = lock.newCondition();


    public void Afonction() {
        lock.lock();
        try{
            while(number !=1 ){
                con1.await();
            }
            number =2 ;
            System.out.println(Thread.currentThread().getName()+"AAAAAAA");
            con2.signal();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void Bfunction(){
        lock.lock();
        try{
            while(number != 2){
                con2.await();
            }
            number =3;
            System.out.println(Thread.currentThread().getName()+"=>" + number);
            con3.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }

    public void Cfunction(){
        lock.lock();
        try{
            while(number != 3){
                con3.await();
            }
            number =1;
            System.out.println(Thread.currentThread().getName()+"=>" + number);
            con1.signal();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
            lock.unlock();
        }
    }
}
