package myCode;
import java.util.*;
public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number Of Line => ");
		int n=sc.nextInt();
		int m=n-2;
		if(n==1) {
			System.out.print(" ");
			System.out.println("*");
		}else {
			System.out.println(" *");
			
			for(int i=1;i<=m;i++) {
				System.out.print(" *");
				for(int j=1;j<=2*i-1;j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
				
				
			}System.out.print(" ");
			for(int k=1;k<=n;k++)
				System.out.print("* ");
			
		}

	}

}
