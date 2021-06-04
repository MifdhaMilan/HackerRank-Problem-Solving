//Question: https://www.hackerrank.com/challenges/funny-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.ArrayList; import java.util.Arrays; import java.util.Collections; import java.util.List;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;



public class Solution {

    // Complete the funnyString function below.
    static String funnyString(String s) {
        int i,j;
        char[] a=s.toCharArray();
        int x=a.length;
        int[] arr=new int[x];
        
        for(i=0;i<x;i++){
            arr[i]=(int)a[i];
        }

        int[] dif=new int[x-1];
        
        for(i=0;i<x-1;i++){
            dif[i]=Math.abs(arr[i]-arr[i+1]);
        }
        int[] rev=new int[x-1];
       for(i=0,j=x-2;i<x-1;i++,j--){
              rev[i]=dif[j];
       }
       if(Arrays.equals(dif,rev)){
           return "Funny";
       }else{
           return "Not Funny";
       }



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            String result = funnyString(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
