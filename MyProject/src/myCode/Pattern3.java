package myCode;
import java.util.*;
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Number Of Line => ");
		int n=sc.nextInt();
		int m=n-2;
		if(n==1) {
			System.out.println("  *");
		}else {
			for(int q=1;q<=n-1;q++)
				System.out.print(" ");
			System.out.println("*");
			
			for(int i=1;i<=m;i++) {
				for(int j=1;j<=m-i+1;j++)
					System.out.print(" ");
				System.out.print("*");
				for(int k=1;k<=2*i-1;k++)
					System.out.print(" ");
				System.out.println("*");
			}
			for(int p=1;p<=n;p++)
				System.out.print("* ");
		}
	}

}
