package hackerRank;
import java.util.*;
public class PrimeChecker {
	static boolean isPrime(int n) {
		boolean prime=false;
		if(n==0 || n==1)
			prime=false;
		else if(n==2)
			prime=true;
		else {
			for(int k=2;k<n;k++) {
				if(n%k==0) {
					prime=false;
					break;
				}
				else 
					prime=true;
			}
		}
		return prime;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextInt();
		}
		int prime[]=new int[5];
		int count=0;
		for(int i=0;i<5;i++) {
			if(isPrime(a[i])==true) {
				prime[count]=a[i];
				count++;
				for(int k=0;k<count;k++) {
					System.out.print(prime[k]+" ");
				}System.out.println();
			}else {
				System.out.println();
			}
			
		}

	}

}
