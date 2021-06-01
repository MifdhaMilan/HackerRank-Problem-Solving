//Question: https://www.hackerrank.com/challenges/bon-appetit/problem

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
        int k=sc.nextInt();
        int[] arr=new int[n];
        int i,sum=0,total;
        for(i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int b=sc.nextInt();
        for(i=0;i<n;i++){
            if(i!=k){
                sum=sum+arr[i];
            }
        }
        total=sum/2;
        if(b==total){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-total);
        }
    }

   


    }

   
