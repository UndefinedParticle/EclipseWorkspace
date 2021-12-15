package codechef;
import java.util.*;
public class TheLeadGame {
	static int myMax(int a[],int n) {
		int max=-1;
		for(int i=0;i<n;i++) {
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	static int search(int arr[],int n,int x){
        for(int i=0;i<n;i++){
        if(arr[i]==x)
            return i+1; 
        }return -1;
    }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give number of lines => ");
		int n=sc.nextInt();
		int p1[]=new int[n+1];
		int p2[]=new int[n+1];
		p1[0]=0;p2[0]=0;
		int CfP1=0,CfP2=0;
		int P1Lead[]=new int[n];
		int P2Lead[]=new int[n];
		for(int i=1;i<=n;i++) {
			p1[i]=sc.nextInt();
			p2[i]=sc.nextInt();
			CfP1=CfP1+p1[i];
			//System.out.print(CfP1+" ");
			CfP2=CfP2+p2[i];
			//System.out.println(CfP2);
			if(CfP1>CfP2) {
				P1Lead[i-1]=CfP1-CfP2;
			}
			if(CfP1<CfP2) {
				P2Lead[i-1]=CfP2-CfP1;
			}
		}
		int max1=myMax(P1Lead,n);
		int max2=myMax(P2Lead,n);
		int leadPlayer;
		int max=Math.max(max1, max2);
		int s=search(P1Lead,n,max);
		if(s==-1)
			leadPlayer=2;
		else leadPlayer=1;
		System.out.println(leadPlayer+" "+max);
		sc.close();
	}

}
