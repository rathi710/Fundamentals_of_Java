package Unit_03;

/*
Aspects of Synchronization in multithreading:
 1-where and when to use synchronized keyword
   ->when there is a shared resource,we use syncronized keyword bcoz sometimes the context switching 
     updates the same thing 2 times
 2-where and when to use join method
 	->when we want the main method to wait for a thread to finish first, then go down to execute other
 3-what is shared resource
*/


/*
Suppose we have 50 lines of code in our method, 
but we want to synchronize only 5 lines, in such cases, 
we can use synchronized block.
*/

//You want T1 to complete first and then T2, then we have to use synchronization keyword



public class P16_MultiThreading_Synchronization {

 public static void main(String[] args) throws InterruptedException {

  WebCount obj = new WebCount();

  System.out.println(Thread.currentThread().getName());
  
  Thread threadOne = new Thread(new Runnable() {
   @Override
   public void run() {
	   for (int i = 1; i <= 1000; i++) {
		   obj.webcount();
    }
   }
  });

  Thread threadTwo = new Thread(new Runnable() {
   @Override
   public void run() {
    for (int i = 1; i <= 1000; i++) {

     obj.webcount();

    }
   }
  });

  threadOne.start();
  threadTwo.start();

  //Waits for this thread to die. {Main thread will wait until this thread is finished}
  threadOne.join();
  
  //Waits for this thread to die. {Main thread will wait until this thread is finished}
  threadTwo.join();

  System.out.println("Count: " + WebCount.count);

 }

}

class WebCount {

 public static int count = 0;

 //You want T1 to complete first and then T2 
 public synchronized void webcount() {
  
  //If not synchronized then, T1 and T2 may read the same value of count at 
  //the same time and may increment same time as well
  count++;
 }
}