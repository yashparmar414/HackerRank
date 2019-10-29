/*
 * This program finds the count of maximum value in array
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
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

public class BirthdayCakeCandles {

    // Complete the birthdayCakeCandles function below.
    static int birthdayCakeCandles(int[] ar) {
        
        int noOfBlownCandles=1,largest=ar[0];
        for(int i=1;i<ar.length;i++)
        {
            if(ar[i]>largest)
            {
                largest=ar[i];
                noOfBlownCandles=1;
            }
            else if(ar[i]==largest)
                noOfBlownCandles++;
        }
        return noOfBlownCandles;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int arCount = scanner.nextInt();
        int[] ar = new int[arCount];
        for (int i = 0; i < arCount; i++) {
            ar[i] = scanner.nextInt();
        }
        int result = birthdayCakeCandles(ar);
        System.out.println(String.valueOf(result));
        scanner.close();
    }
}
