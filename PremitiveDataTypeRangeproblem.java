package Problems;

import java.util.Scanner;

public class PremitiveDataTypeRangeproblem {
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int t= sc.nextInt();
		
		for(int i=0;i<t;i++) {
			int n= sc.nextInt();
			
			System.out.println(n + "can be fitted in:");
			
			boolean fit= false;
			
			if(n>=Byte.MIN_VALUE && n<= Byte.MAX_VALUE) {
				System.out.println("* byte");
				fit=true;
			}
			
			if(n>=Short.MIN_VALUE && n<=Short.MAX_VALUE) {
				System.out.println("* short");
				fit=true;
			}
			
			if(n>=Integer.MIN_VALUE && n<=Integer.MAX_VALUE) {
				System.out.println("* int");
				fit=true;
			}
			
			if(n>=Long.MIN_VALUE && n<=Long.MAX_VALUE) {
					System.out.println("* long");
					fit=true;
				}
			
			if(!fit) {
				System.out.println(n + "can't be fitted anywhere");
			}
			
			
		}
	}

}
