//Question: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {
        int count=0;
        for(int x=i;x<=j;x++){
            int p=x,size=0;
            while(p>0){
                p=p/10;
                size++;
            }
            int[] arr=new int[size];
            
            int q=x,r=0;
            while(q>0){
                arr[r]=q%10;
                q=q/10;
                r++;

            }
            int mul=1,sum=0;
            for(int b=size-1;b>=0;b--){
                sum=sum+arr[b]*mul;
                mul*=10;

            }
            int num=Math.abs(sum-x);
            
            if(num%k==0){
                count++;
            }

        }
        return count;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] ijk = scanner.nextLine().split(" ");

        int i = Integer.parseInt(ijk[0]);

        int j = Integer.parseInt(ijk[1]);

        int k = Integer.parseInt(ijk[2]);

        int result = beautifulDays(i, j, k);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
