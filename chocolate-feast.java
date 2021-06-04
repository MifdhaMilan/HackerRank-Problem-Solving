//Question: https://www.hackerrank.com/challenges/chocolate-feast/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the chocolateFeast function below.
   public static void main(String[] args){
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       for(int i=0;i<t;i++){
           int n=sc.nextInt();
           int c=sc.nextInt();
           int m=sc.nextInt();

           int in=n/c;
        int wrap=in;
        int free=0;

        
        while(wrap>=m){
        
           int ex=wrap-(wrap%m);
           free=wrap/m;
           wrap=(wrap-ex)+free;
           in=in+free;
       }
        

       
System.out.println(in);

    }
   }
}
    
