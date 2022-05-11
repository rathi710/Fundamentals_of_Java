package Assignment_01;

import java.util.Scanner;

class CarModels
{
	int Maruti_K10;
	int Zen_Astel0;
	int Wagnor;
	int Maruti_SX4;
	CarModels()
	{
		Scanner s=new Scanner(System.in);
		this.Maruti_K10=s.nextInt();
		this.Zen_Astel0=s.nextInt();
		this.Wagnor=s.nextInt();
		this.Maruti_SX4=s.nextInt();
	}
}
public class Q10 {

	public static void main(String[] args) {
		
		 	CarModels Cities[]=new CarModels[4];
		 	for(int i=0;i<4;i++)
		 	{
		 		Cities[i]=new CarModels();
		 	}
		 	System.out.println("Cars sold of Maruti-K10"+(Cities[0].Maruti_K10+Cities[1].Maruti_K10+Cities[2].Maruti_K10+Cities[3].Maruti_K10));
		 	System.out.println("Cars sold of Zen-Astelo"+(Cities[0].Zen_Astel0+Cities[1].Zen_Astel0+Cities[2].Zen_Astel0+Cities[3].Zen_Astel0));
		 	System.out.println("Cars sold of Wagnor"+(Cities[0].Wagnor+Cities[1].Wagnor+Cities[2].Wagnor+Cities[3].Wagnor));
		 	System.out.println("Cars sold of Maruti-SX4"+(Cities[0].Maruti_SX4+Cities[1].Maruti_SX4+Cities[2].Maruti_SX4+Cities[3].Maruti_SX4));

	
	}
		

}