import java.util.Scanner;

public class Main
{
	public static Scanner sc=new Scanner(System.in);
	public static void main(String args[])
	{
		int a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			int b=sc.nextInt();
			int c=sc.nextInt();
			if(b<=50 && c<=50)//20180109
				System.out.println("inside");
			else
				System.out.println("outside");
		}
	}
}