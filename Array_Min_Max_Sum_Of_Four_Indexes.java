/*
 * This program prints Minimum and maximum addition of n-1 elements in array of n elements
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Example:
        n=5
		n-1=4 elems should be added only
		finding Maximum on addition of 4 elements
		finding Minimum on addition of 4 elements		
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Array_Min_Max_Sum_Of_Four_Indexes {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        long sum=0;
        Arrays.sort(arr);
        for(int i:arr)
        {
            sum+=i;
        }
        System.out.println((sum-arr[4])+" "+(sum-arr[0]));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
