//Question: https://www.hackerrank.com/challenges/lisa-workbook/problem

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
        int chapters=sc.nextInt();
        int max=sc.nextInt();
        int[] arr=new int[chapters];
        int i;
        for(i=0;i<chapters;i++){
            arr[i]=sc.nextInt();
        }
       int page=1,result=0;
        for(i=0;i<chapters;i++){
            
            for(int pr=1;pr<=arr[i];pr++){
                if(pr==page){
                    result++;
                }
                if(pr%max==0 || pr==arr[i] ){
                    page++;
                }
            }
        }
        System.out.println(result);
    }
}

    
