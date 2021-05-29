//Question: https://www.hackerrank.com/challenges/mini-max-sum/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum=0;long[] a=new long[5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
           if(i!=j){
               sum+=arr[j];
           }
          
           
        }
        a[i]=sum;
        sum=0;
        }
         
        long max=0,min=a[0];
        for(int x=0;x<5;x++){
            if(a[x]>max){
                max=a[x];
            }if(a[x]<=min){
                min=a[x];
            }
        }
        System.out.println(min+" "+max);


    }

     

    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner scanner = new Scanner(System.in);

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}

