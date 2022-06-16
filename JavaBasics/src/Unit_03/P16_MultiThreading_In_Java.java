package Unit_03;
/*
 * What is Multiprocessing?
 * What is Parallel Processing?
 * What is Sequential Processing?
 * What is Concurrent Processing?
 * 
 *Program counter holds the address of next instruction to be executed by some processing unit
 * What is Multitasking?
 * Sequential multitasking
 * parallel multitasking
 * 
 * concurrent Multitasking
 * 
 * 
 * Users:MultiThreading task
 * - it is the users job to find out the independent task of the process.
 * - you found t1,t2,t3 and t4 tasks of process T1 out of 8 total tasks.
 * - context switching between  these task  and the worst time is not decided by the user instead JVM will decide this all.
 * - MultiThreading is applied only when concurrent multitasking occurs
 * - JVM does not work until the thread is started by user
 * - it is users job to put these independent codes into their respective threads (T1,T2,T3,T4)
 * - user have to start these threads by 
 * 	- T1.start()
 * 	- T2.start()
 *  - T3.start()
 *  - T4.start()
 */
public class P16_MultiThreading_In_Java {

	public static void main(String[] args) {
	//main method will execute C1.show1() and C2.show() in sequence
//		C1 obj1=new C1();
//		obj1.show1();
//		C2 obj2=new C2();
//		obj2.show2();
		Thread t1=new Thread(new T1(),"T1");
		Thread t2=new Thread(new T2(),"T2");
		t1.start();
		t2.start();
	}

}
class C1{
	void show1() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"- Hey_1!");
		}
	}
}
class C2{
	void show2() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"- Hey_2!");
		}
	}
}
class T1 extends Thread{
	
	public void run() {
		try {
			Thread.sleep(5000);
			System.out.println("hello");
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}
//class T1 implements Runnable{
//	@Override
//	public void run() {
//		for(int i=0;i<10;i++) {
//			System.out.println(i+"- Hey_1!");
//		}
//	}
//}
class T2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i+"- Hey_2!");
		}
	}
}
//ctrl+shift+t >>>> object class