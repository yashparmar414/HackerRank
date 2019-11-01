/*
 * Description is quite large, read problem statement from following site :  
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;

public class ApplesAndOranges {
	
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
		int app=0,ora=0;
		for(int i=0,j=0;i<apples.length || j<oranges.length;i++,j++) {
			if(i<apples.length && apples[i]+a>=s && apples[i]+a<=t)
				app++;
			if(j<oranges.length && oranges[j]+b>=s && oranges[j]+b<=t)
				ora++;
		}
		System.out.println(app+"\n"+ora);
    }

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int s = sc.nextInt();
        int t = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int m = sc.nextInt();
		int n = sc.nextInt();
        int[] apples = new int[m];
        int[] oranges = new int[n];
        
		for (int i = 0; i < m; i++) {
            apples[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            oranges[i] = sc.nextInt();
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);
		sc.close();
    }
}
