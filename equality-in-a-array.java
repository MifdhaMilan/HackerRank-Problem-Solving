//Question: https://www.hackerrank.com/challenges/equality-in-a-array/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
public static void main(String[] args){
    // Complete the equalizeArray function below.
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int[] arr=new int[n];
    int[] count=new int[n];
        
        int i,j,max=0,maxx=0,cnt=0;
        for(i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
for(i=0;i<n;i++){
    int x=1;
    for(j=i+1;j<n;j++){
if(arr[i]==arr[j]){
    x++;
}
    }
    count[i]=x;
}
for(i=0;i<n;i++){
    if(count[i]>max){
        max=count[i];
        maxx=arr[i];
    }

}
for(i=0;i<n;i++){
    if(arr[i]!=maxx){
cnt++;
    }
}
System.out.println(cnt);
   

    }
}

    
