/*
 * This program accepts two arrays, then it compares the value at index i, then increament scores according to comparison. For more details, visit below link:
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
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

public class CompareTriplets {

    // Complete the compareTriplets function below.
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> result=new ArrayList<Integer>(Arrays.asList(0,0));
    
        for(int i=0;i<a.size();i++)
        {
            if(a.get(i)>b.get(i))
                result.set(0,(result.get(0)+1));
            if(a.get(i)<b.get(i))
                result.set(1,(result.get(1)+1));
        }
        return result;
    }
    public static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
   
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int aItem = scanner.nextInt();
            a.add(aItem);
        }
        
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            int bItem = scanner.nextInt();
            b.add(bItem);
        }
        
        List<Integer> result = compareTriplets(a, b);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(String.valueOf(result.get(i)));
            if (i != result.size() - 1) {
                System.out.print(" ");
            }
        }
    }
}
