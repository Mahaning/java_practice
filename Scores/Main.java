import java.util.*;
public class Main{

	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);

		int count=sc.nextInt();
		int[] a=new int[count];
		for(int i=0;i<count;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(UserMainCode.checkscores(a,count));
		sc.close();
}
}
		