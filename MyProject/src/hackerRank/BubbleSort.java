package hackerRank;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Give number of input => ");

		int n=sc.nextInt();

		int a[]=new int[n];

		System.out.println("Enter "+n +" numbers");

		for(int i=0;i<n;i++) {

			a[i]=sc.nextInt();

		}

		System.out.println("Internal Process for every step => ");

		for(int i=0;i<n-1;i++) {

			for(int j=0;j<n-1;j++) {

				if(a[j]>a[j+1]) {

					int temp=a[j];

					a[j]=a[j+1];

					a[j+1]=temp;

				}

				

			}

			System.out.print(i+". ");

			for(int k=0;k<n;k++)

				System.out.print(+a[k]+" ");

			System.out.println();

		}

		System.out.println();

		System.out.println("The sorted numbers are => ");

		for(int i=0;i<n;i++) {

			System.out.print(+a[i]+" ");

		}

	}

}
