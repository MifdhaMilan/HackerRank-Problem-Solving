//Question: https://www.hackerrank.com/challenges/fair-rations/problem

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
        int i,sum=0,count=0;
        int[] arr=new int[n];
        for(i=0;i<n;i++){
          arr[i]=sc.nextInt();
          sum+=arr[i];
        }
        if(sum%2==1){
            System.out.println("NO");
        }else{
            for(i=0;i<n;i++){
                if(arr[i]%2==1){
                    arr[i]=arr[i]+1;
                    arr[i+1]=arr[i+1]+1;
                    count+=2;
                }
            }
            System.out.println(count);
        }
        

    }
    }
    
