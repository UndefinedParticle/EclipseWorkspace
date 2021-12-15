package codechef;
import java.util.*;
import java.io.*;
public class ATM {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount=> ");
		int x=sc.nextInt();
		float y=sc.nextFloat();
		if(x%5==0&&x+0.50<=y) {
			System.out.format("%.2f",y-x-0.50);
		}else
			System.out.format("%.2f",y);

	}

}