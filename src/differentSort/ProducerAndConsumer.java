package differentSort;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Queue;

public class ProducerAndConsumer {
    private final int MAXLEN=10;
    private Queue<Integer> queue = new LinkedList<Integer>();

    class Producer extends Thread{
        public  void run(){
            producer();
        }

        private void producer(){
            while(true){
                synchronized (queue){
                    while ((queue.size()==MAXLEN)){
                        queue.notify();
                        System.out.println("满了");
                        try{
                            queue.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    queue.add(1);
                    queue.notify();
                    System.out.println("生产者生产一条任务，当前队列长度为" + queue.size());
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }


    }

    class Consumer extends Thread{
        public  void run(){
            consumer();
        }

        private void consumer(){
            while(true){
                synchronized (queue){
                    while ((queue.size()==0)){
                        queue.notify();
                        System.out.println("空了");
                        try{
                            queue.wait();
                        }catch (InterruptedException e){
                            e.printStackTrace();
                        }
                    }
                    queue.poll();
                    queue.notify();
                    System.out.println("生产者消费一条任务，当前队列长度为" + queue.size());
                    try{
                        Thread.sleep(500);
                    }catch (InterruptedException e){
                        e.printStackTrace();
                    }
                }
            }
        }


    }

    public static void main(String[] args) {
        ProducerAndConsumer pc = new ProducerAndConsumer();
        Producer producer = pc.new Producer();
        Consumer consumer = pc.new Consumer();
        producer.start();
        consumer.start();
    }
}
