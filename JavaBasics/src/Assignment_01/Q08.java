package Assignment_01;

public class Q08 {

	public static void main(String[] args) {
		int[] arr= {2,5,1,3,4,5,6,7};
		int key =3;
		int j=0,n=arr.length;
		for(int i=0;i<n;i++)
		{
			if(i==key)
			{
				j=i;
			}
		}
		for(int i=j;i<n-1;i++)
		{
			arr[i]=arr[i+1];
		}
		arr[n-1]=0;
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}

}