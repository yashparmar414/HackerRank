/*
 * This program finds the Difference between addition of two diagonals in square matrix
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
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

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr, int n) {
    // Write your code here
        int sum1=0,sum2=0;
        int k=(n-1);
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    List<Integer> l1=arr.get(i);
                    sum1=sum1+l1.get(i);
                }
                if(i+j==(n-1) && k>=0)
                {
                    List<Integer> l1=arr.get(i);
                    sum2+=l1.get(j);
                    k--;
                }
            }
        }
        int result=Math.abs(sum1-sum2);
        return result;
    }
}

public class DiagonalMatrixDifference{
    pubic static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> arrRowItems = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                int arrItem = scanner.nextInt();
                arrRowItems.add(arrItem);
            }
            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr,n);

        System.out.println(String.valueOf(result));
    }
}
