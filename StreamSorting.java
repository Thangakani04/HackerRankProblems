package Problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 2, 9, 1, 7);
      
        List<Integer> sortedNumbers = numbers.stream()
                                             .sorted()
                                             .collect(Collectors.toList());
        
        List<Integer> descnum = numbers.stream()
        		.sorted(Comparator.reverseOrder())
        		.collect(Collectors.toList());

        System.out.println("Sorted List in ascending order : " + sortedNumbers);
        System.out.println("Sorted List in descending order : " + descnum);
        
        
    }
}