package pkg35;
import java.util.*;

public class calculateDifference {
	
	    public static void main(String[] args)

	    {
	        System.out.println("Enter the Number");
	        Scanner s=new Scanner(System.in);
	        int n=s.nextInt();
	        int p= sumofsquare(n);                
	        int q=squareofsum(n);                 
	        int r=difference(q,p);    
	        s.close();
	        System.out.println("Difference between square of sum and sum of square is:"+r);
	    }

	     public static int sumofsquare(int n)
	    {
	            int  a=0;
	        for(int i=1;i<=n;i++)
	        {
	          a=a+(i*i);
	               }
	        System.out.println("Sum of the squares is :"+a);
	        return a;
	    }
	         public static int squareofsum(int n)
	    {
	            int b=0;

	        for(int i=1;i<=n;i++)
	        {
	            b=b+i;

	        }
	        b=b*b;
	        System.out.println("Square of the sum is:"+b);
	        return b;
	    }

	public static int  difference(int q,int p)
	    {
	        int d=0;
	        d=q-p; 
	        
	        return d;
	    }

	}
