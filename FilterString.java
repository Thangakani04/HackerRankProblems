package Problems;

import java.util.*;
import java.util.stream.*;

public class FilterString {
    public static void main(String[] args) {
        String input = "name aj but ant";
        
        // Using streams to filter and get the second word that starts with 'a'
        Optional<String> secondWordStartingWithA = Arrays.stream(input.split(" "))
                .filter(word -> word.startsWith("a"))
                .skip(1)  // Skip the first match (if any)
                .findFirst();  // Get the second match, if available

        secondWordStartingWithA.ifPresent(System.out::println);  // Will print 'ant'
        
        
        String in = "name animal is anu";
        Optional<String> secondwordstarting = Arrays.stream(in.split(" "))
        		.filter(word -> word.startsWith("a"))
        		.skip(1)
        		.findFirst();
        
        secondwordstarting.ifPresent(System.out::println);
    }
}
