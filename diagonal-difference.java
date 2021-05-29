//Question: https://www.hackerrank.com/challenges/diagonal-difference/problem

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
    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
       int i,j,sum1=0,sum2=0,x;
       for(i=0;i<n;i++){
           for(j=0;j<n;j++){
               arr[i][j]=sc.nextInt();
           }
       }
       for(i=0;i<n;i++){
           for(j=0;j<n;j++){
               if(i==j){
            sum1+=arr[i][j];
               }
           }
       }
       for(i=0,j=n-1;i<n;i++,j--){
           sum2+=arr[i][j];
       }
       int result=Math.abs(sum1-sum2);
       System.out.println(result);
    }
}
