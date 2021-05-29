//Question: https://www.hackerrank.com/challenges/compare-the-triplets/problem

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


    public static void main(String[] args) {
        int[] a=new int[3];
        int[] b=new int[3];
        int[] result=new int[2];
        Scanner sc=new Scanner(System.in);
        int i,alice=0,bob=0;
        for(i=0;i<3;i++){
            a[i]=sc.nextInt();
        }
        
        for(i=0;i<3;i++){
            b[i]=sc.nextInt();
        }
        for(i=0;i<3;i++){
            if(a[i]>b[i]){
             alice++;
            }else if(a[i]<b[i]){
                bob++;
            }else{
                continue;
            }
        }
        
            result[0]=alice;
            result[1]=bob;
        
        System.out.println(result[0]+" "+result[1]);

        
    }
}
