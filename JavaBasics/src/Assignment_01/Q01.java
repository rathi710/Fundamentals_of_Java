package Assignment_01;
import java.util.Scanner;
public class Q01 {

	public static void main(String[] args) {
		Student array[];
		array=new Student[6];
		for(int i=0;i<6;i++)
		{
			array[i]=new Student();
		}
		//System.out.println(s1.name);
		int avg=0;
		for(int i=0;i<6;i++)
		{
			avg+=array[i].per;
		}
		System.out.println("The average percentage of 6 students is: ");
		System.out.println(avg/6);

	}
}
	
class Student
{
	String name;
	int age;
	char sec='A';
	float per;
	Student()
	{
		System.out.println("Enter Student Details:");
		Scanner s=new Scanner(System.in);
		System.out.print("Name: ");
		this.name=s.nextLine();
		System.out.print("Age: ");
		this.age=s.nextInt();
		System.out.print("Percentage: ");
		this.per=s.nextFloat();
	}
	
}