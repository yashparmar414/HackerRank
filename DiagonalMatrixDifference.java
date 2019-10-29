/*
 * This program finds the Difference between addition of two diagonals in square matrix
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/

java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class DiagonalMatrixDifference{
	public static int diagonalDifference(List<List<Integer>> arr, int n) {
		int sum1=0,sum2=0;
		for(int i=0,j=(n-1);i<n;i++,j--)
		{
			sum1=sum1+((arr.get(i)).get(i));
			sum2=sum2+((arr.get(i)).get(j));
		}
		return (Math.abs(sum1-sum2));
	}
	
	public static Scanner scanner = new Scanner(System.in);
    
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
		int result = diagonalDifference(arr,n);
		System.out.println(String.valueOf(result));
	}
}
