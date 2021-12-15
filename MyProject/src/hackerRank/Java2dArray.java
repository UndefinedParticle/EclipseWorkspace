package hackerRank;
import java.util.*;

public class Java2dArray {

	public static void main(String[] args) {
		int mask=0x000F;
		int value=0x2222;
		System.out.println(value & mask);
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[6][6];
		int maxSum=Integer.MIN_VALUE;
		System.out.println("Give tha data of the array => ");
		for(int i=0;i<6;i++) {
			for(int j=0;j<6;j++) {
				a[i][j]=sc.nextInt();
				if(i>1&&j>1) {
					int sum= a[i][j]+a[i][j-1]+a[i][j-2]+a[i-1][j-1]+a[i-2][j]+a[i-2][j-1]+a[i-2][j-2];
					if(sum>maxSum)
						maxSum=sum;
				}
			}
		}
		System.out.println(maxSum);

	}

}
