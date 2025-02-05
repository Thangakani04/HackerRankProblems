package Problems;

import java.util.Scanner;

public class RangeProblem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        // Iterate over each test case
        for (int i = 0; i < t; i++) {
            long n = scanner.nextLong(); // Read the integer

            System.out.println(n + " can be fitted in:");

            boolean fit = false;

            // Check if the number can fit in byte
            if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                System.out.println("* byte");
                fit = true;
            }

            // Check if the number can fit in short
            if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                System.out.println("* short");
                fit = true;
            }

            // Check if the number can fit in int
            if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                System.out.println("* int");
                fit = true;
            }

            // Check if the number can fit in long
            if (n >= Long.MIN_VALUE && n <= Long.MAX_VALUE) {
                System.out.println("* long");
                fit = true;
            }

            // If the number cannot fit in any of the types
            if (!fit) {
                System.out.println(n + " can't be fitted anywhere.");
            }
        }
        
        scanner.close();
    }
}

