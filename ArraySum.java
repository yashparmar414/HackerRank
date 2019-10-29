/*
 * This program finds sum of all elements in array.
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ArraySum {
    
    static int simpleArraySum(int[] ar) {
        int sum=0;
        for(int i:ar)
            sum+=i;
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arCount = scanner.nextInt();
        int[] ar = new int[arCount];
        for (int i = 0; i < arCount; i++) {
            ar[i] = scanner.nextInt();
        }
        int result = simpleArraySum(ar);
        System.out.println(String.valueOf(result));
    }
}
