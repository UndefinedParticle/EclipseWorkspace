package codechef;
import java.util.*;
public class EnormousInputTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long k=sc.nextLong();
		int count=0;
		for(int i=0;i<n;i++) {
			long t=sc.nextLong();
			if(t%k==0) {
				count++;
			}
		}System.out.println(count);
		sc.close();

	}

}
