package labpkg1;
import java.util.Scanner;
public class CubeSumArray {
public static void getCubeSum(int n)
{   
    int r,c,sum=0;
    if((n==0) || (n==1))
    System.out.println("sum of cube of given number is:"+n);  
    else if(n<1)
     System.out.println("sum of cube of given number is invalid");  
    else if(n<9)
    System.out.println("sum of cube of given number is:"+n*n*n);    
    else
    {
    while(n!=0)
    {
    r=n%10;
    c=r*r*r;
    sum=sum+c;
    n=n/10;
    }
    System.out.println("sum of cube of given number is:"+sum);    
    }
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		System.out.println("enter any number");
		Scanner s = new Scanner(System.in);
		num=s.nextInt();
		s.close();
		getCubeSum(num);
		
	}

}
