package codechef;
import java.util.*;
public class ReverseTheNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Number of Test cases => ");
		int t=sc.nextInt();
		for(int i=0;i<t;i++) {
			int n=sc.nextInt();
			int r,temp=n;
			int x=0;
			while(temp!=0){
				r=temp%10;
				temp=temp/10;
				x=x*10+r;
			}
			System.out.println(x);
		}sc.close();
	}

}
