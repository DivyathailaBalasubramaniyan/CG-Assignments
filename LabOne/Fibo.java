package labpkg1;
import java.util.Scanner;
public class Fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
			System.out.println("Enter number:");
			int n=s.nextInt();
			s.close();
			int n1=1;
			int n2=1;
			System.out.print(n1+" ");System.out.print(n2+" ");
			int n3;
			for(int i=3;i<=n;i++){
			n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
	}
	}
}
