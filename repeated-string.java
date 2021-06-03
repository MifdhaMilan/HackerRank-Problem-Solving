//Question: https://www.hackerrank.com/challenges/repeated-string/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        char[] arr=s.toCharArray();
        int i,count=0,cnt=0;
        for(i=0;i<arr.length;i++){
            if(arr[i]=='a'){
                count++;
            }
        }
        long len=(n/arr.length)*count;
        long extra=n%arr.length;
        if(extra==0){
           return len;
        }else{
            for(i=0;i<extra;i++){
                if(arr[i]=='a'){
               cnt++;
                }
            }
            return len+cnt;
        }


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
