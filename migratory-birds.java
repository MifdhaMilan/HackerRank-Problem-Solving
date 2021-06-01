//Question: https://www.hackerrank.com/challenges/migratory-birds/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {
    
    static final int NUM_TYPES = 5;
    
    static int migratoryBirds(int[] birds) {
        /* Get counts of each type */
        int[] count = new int[NUM_TYPES + 1];
        for (int num : birds) {
            count[num]++;
        }
        
        /* Find max */
        int maxIndex = 1;
        for (int i = 0; i < count.length; i++) {
            if (count[i] > count[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        /* Save input */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] birds = new int[n];
        for (int i = 0; i < n; i++){
            birds[i] = scan.nextInt();
        }
        scan.close();
        
        /* Calculate result */
        int result = migratoryBirds(birds);
        System.out.println(result);
    }
}
