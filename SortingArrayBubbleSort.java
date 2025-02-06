package Problems;

import java.util.Arrays;

public class SortingArrayBubbleSort {

	
	public static void main(String[] args) {
		
		int a[] = {4,5,3,1,2};
		
		System.out.println(" Before sorting array :" + Arrays.toString(a));
		
		int n= a.length;
		 for(int i=0;i<n-1;i++) {  //Number of passes
			 
			 for(int j=0;j<n-1;j++) {  //Iteration in each passes
				 
				 if(a[j]>a[j+1]) {
					 
					 int temp=a[j];
					 a[j] = a[j+1];
					 a[j+1]=temp;
				 }
			 }
		 }
		 
		 System.out.println(" After sorting array :" + Arrays.toString(a));
	}

}
