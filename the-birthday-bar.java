//Question: https://www.hackerrank.com/challenges/the-birthday-bar/problem

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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0,i;
        int[] arr=new int[n];
        for( i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int d=sc.nextInt();
        int m=sc.nextInt();
        for(i=0;i<n;i++){
            int x=0;
            for(int j=i+m-1;j>=i;j--){
                
                if(j>n-1){
                    x=x;
                }else{
x=x+arr[j];
                }


            }
            if(x==d){
                count++;
            }
        }
        System.out.println(count);
    }
}


   
