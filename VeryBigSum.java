/*
 * This program finds sum of big format array elements. Go to Below Link for more description. 
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
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

public class VeryBigSum {

    // Complete the aVeryBigSum function below.
    static long aVeryBigSum(long[] ar) {
        long sum=0;
        for(long i:ar)
            sum+=i;
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       
        int arCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long[] ar = new long[arCount];
        
        for (int i = 0; i < arCount; i++)
            ar[i] = scanner.nextLong();
            
        long result = aVeryBigSum(ar);
        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
