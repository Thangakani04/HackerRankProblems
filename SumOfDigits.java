package Problems;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumDigits(int number) {
        int sum = 0;
        
        // Sum the digits of the number
        while (number != 0) {
            sum += number % 10;  // Add the last digit to sum sum=4 +3+ +2+1
            number /= 10;         // Remove the last digit 123,12,1
        }
        
        return sum;
    }

    public static void main(String[] args) {
    	Scanner sc= new Scanner(System.in);
    	System.out.println("enter n number :");
        int number = sc.nextInt();
        int result = sumDigits(number);
        System.out.println("Sum of digits: " + result);
    }
}