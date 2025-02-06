package HackerRankproblems;

import java.util.Scanner;

public class SeriesGenerator {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter no of queries : ");
		int q = sc.nextInt();
		
		for(int i=0;i<q;i++) {
		System.out.println("Enter a,b, n for query " +(i+1) + " :");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int n=sc.nextInt();
		
		int sum=a;
		
		System.out.println("series for query " + (i+1) +" : ");
		for(int j=0;j<n;j++) {
			sum=(int) (sum+ Math.pow(2, j) * b);
			System.out.print(sum + " ");  //To print in same line
		}
		System.out.println();  //print new line after each query's result
		
		}
		
		sc.close();
	}

}
