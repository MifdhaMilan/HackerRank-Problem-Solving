//Question: https://www.hackerrank.com/challenges/picking-numbers/problem

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

class Solution {

   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] counting = new int[100];
        int a;
        for(int a_i=0; a_i < n; a_i++){
            a = in.nextInt();
            if (a==0) {
                counting[0]++;
            } else {
                counting[a]++;
                counting[a-1]++;
            }
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 100; i++) {
            if (counting[i] > max ) {
                max = counting[i];
            }
        }
        System.out.println(max);
   }
}

