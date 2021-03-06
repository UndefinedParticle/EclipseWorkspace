package myCode;
import java.util.*;
import java.math.*;
import java.text.*;
public class TridiagonalSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the dimension of the Square matrix => ");
		int n=sc.nextInt();
	    float coMatrix[][]=new float[n][n];
		System.out.println("Please Give the values of the coefficient matrix => ");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				coMatrix[i][j]=sc.nextFloat();
			}
		} float x[]=new float[n];float d[]=new float[n];
		System.out.println("Give the values of d_i's => ");
		for(int i=0;i<n;i++) {
			d[i]=sc.nextFloat();
			
		} float alpha[]=new float[n];float beta[]=new float[n];
		float a[]=new float[n];float b[]=new float[n];float c[]=new float[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j)
					b[i]=coMatrix[i][j];
			}
		}
		for(int i=1;i<n;i++) {
			for(int j=0;j<n-1;j++) {
				if(j==i-1)
					a[i]=coMatrix[i][j];
			}
		}
		for(int i=0;i<n-1;i++) {
			for(int j=1;j<n;j++) {
				if(j==i+1)
					c[i]=coMatrix[i][j];
			}
		}
		alpha[0]=b[0];beta[0]=((d[0])/(b[0]));
		
		for(int i=1;i<n;i++) {
			alpha[i]=b[i]-((a[i]*c[i-1])/alpha[i-1]);
		}
		for(int i=1;i<n;i++) {
			beta[i]=((d[i]-(a[i]*beta[i-1]))/alpha[i]);
		}
		x[n-1]=beta[n-1];
		for(int i=n-2;i>=0;i--) {
			x[i]=beta[i]-((c[i]*x[i+1])/alpha[i]);
		}
		 DecimalFormat df = new DecimalFormat("#.###");
	     df.setRoundingMode(RoundingMode.CEILING);
		System.out.println(" The required solution is => ");
		System.out.print("[ ");
		for(int i=0;i<n;i++) {
			System.out.print(df.format(x[i])+" , ");
		}System.out.println(" ]");

	}

}
