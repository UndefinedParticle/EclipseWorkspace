package hackerRank;
import java.util.*;
public class Java1dArray {
	static boolean canWin(int game[],int leap,int cell) {
		if(cell<0||game[cell]==1) return false;
		if((cell==game.length-1) || (cell+leap>=game.length)) return true;
		game[cell]=1;
		return (canWin(game,leap,cell-1) || canWin(game,leap,cell+1) || canWin(game,leap,cell+leap));
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("The number of quires => ");
		int q=sc.nextInt();
		
		for(int i=0;i<q;i++) {
			int n=sc.nextInt();
			int leap=sc.nextInt();
			//System.out.println("Array elements => ");
			int a[]=new int[n];
			for(int j=0;j<n;j++) {
				a[j]=sc.nextInt();
			}
			//System.out.println("Output => ");
			int k=0;
			if(canWin(a,leap,k)==true) {
				System.out.println("YES");
			}else
				System.out.println("NO");
		}

	}

}
