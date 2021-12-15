package hackerRank;
import java.util.*;
public class JavaSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array => ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the elements of the array => ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}int sum,count=0;
		for(int i=0;i<n;i++) {
			sum=0;
			for(int j=i;j<n;j++) {
				sum=sum+a[j];
				if(sum<0) {
					count++;
				}
			}
		}System.out.println("Required ans is => "+count);
		
		
		sc.close();
	}

}
