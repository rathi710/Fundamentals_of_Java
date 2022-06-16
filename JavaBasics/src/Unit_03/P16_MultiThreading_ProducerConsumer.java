package Unit_03;

import java.util.ArrayList;
import java.util.List;

/*
Suppose we have 50 lines of code in our method, 
but we want to synchronize only 5 lines, in such cases, 
we can use synchronized block.
*/

public class P16_MultiThreading_ProducerConsumer {

 public static class Producer implements Runnable {

  private List<Integer> queue;
  private int next = 0;

  public Producer(List<Integer> queue) {
   this.queue = queue;
  }

  @Override
  public void run() {
   while (true) {

    if (queue.size() == 20) {
     break;
    }

    synchronized (queue) {

     if (queue.size() == 20) {
      System.out.println("Queue is full now wait for consumer to consume it");;
      try {
       queue.wait();
      } catch (InterruptedException e) {
       // TODO Auto-generated catch block
       e.printStackTrace();
      }
     }

     else {

      queue.add(next);
      System.out.println("Produce: " + next);
      // The thread must own the monitor on the queue to call notify
      queue.notifyAll();
     }
    }

    next++;
   }
  }
 }

 public static class Consumer implements Runnable {
  private List<Integer> queue;

  public Consumer(List<Integer> queue) {
   this.queue = queue;
  }

  @Override
  public void run() {
   while (true) {
    synchronized (queue) {

     if (queue.size() > 0) {
      Integer number = queue.remove(queue.size() - 1);
      System.out.println("Consume: " + number);
      queue.notifyAll();

     } else {
      try {
       // The thread must own queue’s monitor to call wait
       queue.wait();
      } catch (InterruptedException e) {
      }
     }
    }
   }
  }
 }

 public static void main(String args[]) throws Exception {

  // Size may grow up to any size {Dynamic Memory Allocation in Heap}
  List<Integer> queue = new ArrayList<Integer>();

  Thread producer1 = new Thread(new Producer(queue));
  Thread producer2 = new Thread(new Producer(queue));
  Thread consumer1 = new Thread(new Consumer(queue));
  Thread consumer2 = new Thread(new Consumer(queue));
  producer1.start();
  producer2.start();
  consumer1.start();
  consumer2.start();

 }

}