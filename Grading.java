/*
 * If the difference between grades and next multiple of 5 is less than or equal to 3, and they are above passing range, then grades will be rounded up to next multiple of 5. 
 * https://www.hackerrank.com/challenges/grading/problem
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.util.*;

public class Grading {

	public static List<Integer> gradingStudents(List<Integer> grades) {
        for(int i=0;i<grades.size();i++)
        {
            int num=grades.get(i);
            if(num>=38)
				num = ((num%5)>=3 && (num%5)<=4) ? grades.set(i,(num+(5-(num%5)))):num;
        }
        return grades;
    }
	public static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        int gradesCount = sc.nextInt();
        List<Integer> grades = new ArrayList<Integer>();
		for(int i=0;i<gradesCount;i++)
		{
			int num=sc.nextInt();
			grades.add(num);
		}
        List<Integer> result = gradingStudents(grades);
		for(int i:result)
			System.out.println(i);
       }
}
