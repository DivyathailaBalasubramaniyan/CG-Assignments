package pkg35;

import java.util.Scanner;

public class ThreeFives {
	static void calculateSum(int n)
	 {
		int sum=0;
		System.out.println("enter a number 3 or 5:");
		Scanner sc1 = new Scanner(System.in);
		int d=sc1.nextInt();
		sc1.close();
		if(d==3)
		{
		for(int m=n;m>=1;m--) 
		{
		int res=m*d;
		sum=sum+res;
		}
		System.out.println("The sum is:"+sum);
		}
		else if (d==5)
		{
		for(int m=n;m>=1;m--) 
		{
		int res=m*d;
		sum=sum+res;
		}
		System.out.println("The sum is:"+sum);
		 
	    }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter a number:");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();	
        calculateSum(num);
        sc.close();
	}

}
