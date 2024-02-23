import java.util.Scanner;

public class Main{

	public static void main(String args[])	{

		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int[] arr=new int[n1];
		for(int i=0;i<n1;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println(UserMainCode.getLargestSpan(arr));

	}
}