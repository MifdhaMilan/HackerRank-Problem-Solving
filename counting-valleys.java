//Question: https://www.hackerrank.com/challenges/counting-valleys/problem


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int i,x=0,count=0;
        int[] arr=new int[n];
        char[] ch=s.toCharArray();
        for(i=0;i<n;i++){
            if(ch[i]=='U'){
                arr[i]=1;

            }else{
                arr[i]=-1;
            }

        }
        if(arr[0]==-1){
            count++;
        }
        for(i=0;i<n-1;i++){
             x=x+arr[i];
             
             if(x==0 && arr[i+1]==-1){
                 count++;
             }
        }
        
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
