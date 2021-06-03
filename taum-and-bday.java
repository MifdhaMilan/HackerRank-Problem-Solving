//Question: https://www.hackerrank.com/challenges/taum-and-bday/problem

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

class Solution {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long b=sc.nextLong();
            long w=sc.nextLong();
            long bc=sc.nextLong();
            long wc=sc.nextLong();
           long z=sc.nextLong();
    
    if(bc>wc && (wc+z)<bc){
        long l2= (wc*w)+(wc*b)+(z*b);
        System.out.println(l2);

    }else if(wc>bc && (bc+z)<wc){
        long l1=(bc*b)+(bc*w)+(z*w);
        System.out.println(l1);
    }else{
        long l3= (b*bc)+(w*wc);
        System.out.println(l3);
    }

    }
    }

}




