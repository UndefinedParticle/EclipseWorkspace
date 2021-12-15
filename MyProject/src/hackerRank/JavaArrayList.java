package hackerRank;
import java.util.*;
public class JavaArrayList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of line => ");
		int n=sc.nextInt();
		List<Integer> al1=new ArrayList<>();
		List<Integer> al2=new ArrayList<>();
		for(int i=0;i<n;i++) {
			al1.add(sc.nextInt());
			for(int j=1;j<=al1.get(i);j++) {
				al2.add(sc.nextInt());
			}
		}
		System.out.println("Enter number of queries => ");
		int q=sc.nextInt();
        int x[]=new int[q];
        int y[]=new int[q];
        for(int i=0;i<q;i++) {
        	int m=0;
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            System.out.println(" x is = "+x[i]);
            System.out.println(" y is = "+y[i]);
            if(y[i]>al1.get(x[i]-1)||x[i]>n) {
                System.out.println("ERROR!");
            }else {
            	for(int p=0;p<x[i]-1;p++) {
            		m=m+al1.get(p);
            	}
                System.out.println(al2.get(m+y[i]-1));
            }
        }
		sc.close();
	}
}
