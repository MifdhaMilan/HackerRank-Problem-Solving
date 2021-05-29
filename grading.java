//Question: https://www.hackerrank.com/challenges/grading/problem

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
        int i,x,y,z;
        int[] arr=new int[n];
        int[] a=new int[n];
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
      for(i=0;i<n;i++){
          if(arr[i]>37){
            x=  arr[i]/5;
            y=5*(x+1);
            z=y-arr[i];
            if(z<3){
                a[i]=y;
            }else{
                a[i]=arr[i];
            }
          }else{
              a[i]=arr[i];

          }
      }
      for(i=0;i<n;i++){
          System.out.println(a[i]);
      }
    }
}


