//Question: https://www.hackerrank.com/challenges/staircase/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int i,j,x;
        for(i=0;i<n;i++){
            for(j=i;j<n-1;j++){
                 System.out.print(" ");
            }
           for(x=0;x<i+1;x++){
               System.out.print("#");
           }
           System.out.println();
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
