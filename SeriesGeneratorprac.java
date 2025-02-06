package HackerRankproblems;

import java.util.Scanner;

import java.util.Scanner;

public class SeriesGeneratorprac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of queries
        System.out.print("Enter the number of queries: ");
        int queries = sc.nextInt();
        
        // Process each query
        for (int i = 0; i < queries; i++) {
            // Read the values for a, b, and n
            System.out.print("Enter a, b, and n for query " + (i + 1) + ": ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();
            
            // Generate the series
            int sum = a;
            System.out.print("Series for query " + (i + 1) + ": ");
            for (int j = 0; j < n; j++) {
                sum += (int) Math.pow(2, j) * b;
                System.out.print(sum + " ");
            }
            System.out.println();  // Print a new line after each query's result
        }
        
        sc.close();
    }
}
