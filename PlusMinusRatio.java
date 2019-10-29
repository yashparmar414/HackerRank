/*
 * This program finds total number of positive elements in array, negative numbers in array, zeros in array then it finds the
   probability by dividing each count by array size
 * https://www.hackerrank.com/challenges/plus-minus/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class PlusMinusRatio{
   
    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        float negativeCount=0,positiveCount=0,zeroCount=0;
        for(int i:arr)
        {
            if(i<0)
                negativeCount+=1;
            else if(i>0)
               positiveCount+=1;
            else
               zeroCount+=1;
        }
        System.out.println(positiveCount/arr.length);
        System.out.println(negativeCount/arr.length);
        System.out.println(zeroCount/arr.length);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
           arr[i] = scanner.nextInt();
        }
        plusMinus(arr);
        scanner.close();
    }
}
