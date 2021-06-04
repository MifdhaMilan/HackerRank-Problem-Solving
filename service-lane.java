//Question: https://www.hackerrank.com/challenges/service-lane/problem

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
       int t=sc.nextInt();
       int x,y;
       int[] arr=new int[n];
       for(x=0;x<n;x++){
            arr[x]=sc.nextInt();

       }
       for(x=0;x<t;x++){
           int i=sc.nextInt();
           int j=sc.nextInt();
           int min=arr[i];
           for(y=i;y<=j;y++){
             if(arr[y]<min){
                 min=arr[y];
             }
           }
           System.out.println(min);
       }
   }
}
