//Question: https://www.hackerrank.com/challenges/circular-array-rotation/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
         int q=sc.nextInt();
         int[] a=new int[n];
         int i;
         for(i=0;i<n;i++){
             a[i]=sc.nextInt();
         }
         int r=k%n;
         for(i=0;i<q;i++){
             int m=sc.nextInt();
             if(m-r>=0){
                 System.out.println(a[m-r]);
             }else{
                  System.out.println(a[m-r+n]);
             }
         }
    }

}
