/*
 * This program prints the pyramid of right-aligned-staircase
 * https://www.hackerrank.com/challenges/staircase/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
 * Output example:
          #
         ##
	###
       ####
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class StairCasePyramid {

    // Complete the staircase function below.
    static void staircase(int n) {
        for(int i=(n-1);i>=0;i--)
        {
            int j;
            for(j=0;j<i;j++)
                System.out.print(" ");
            for(int k=j;k<n;k++)
                System.out.print("#");
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        staircase(n);
        scanner.close();
    }
}
