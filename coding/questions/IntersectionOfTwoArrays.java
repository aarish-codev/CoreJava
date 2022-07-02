package coding.questions;


/*
Q-> Find the common elements between two arrays
[1,2,3,4] AND [3,4,5,7,8]
Intersection elements -> [3,4]
*/

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class IntersectionOfTwoArrays {

    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4};
        int[] arr2 = new int[]{3, 4, 5, 6};

        Set<Integer> set1 = Arrays.stream(arr1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(arr2).boxed().collect(Collectors.toSet());

        List<Integer> integers = set2.stream().filter(set1::contains).collect(Collectors.toList());
        System.out.println(integers);


    }
}