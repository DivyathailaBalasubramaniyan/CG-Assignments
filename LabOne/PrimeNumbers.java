package pkg35;
import java.util.Scanner;

public class PrimeNumbers {
	public static void main(String[] args)
	{
		int num;
		int pr;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter any number: ");
		num=s.nextInt();
		s.close();
		
		for(int i=2;i<num;i++)
		{
			pr=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				pr=1;
			}
			if(pr==0)
				System.out.println(i);
		}
	}

}
