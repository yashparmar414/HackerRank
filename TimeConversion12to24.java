/*
 * This program Converts time from 12-hrs fomat to 24-hrs format.
 * https://www.hackerrank.com/challenges/time-conversion/problem
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
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion12to24 {

    static String timeConversion(String s) throws Exception{
        s=s.substring(0,8)+" "+s.substring(8,s.length());
        SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
        Date date = inputFormat.parse(s);
        return (outputFormat.format(date));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String s = scanner.next();
        System.out.println(timeConversion(s));
    }
}
