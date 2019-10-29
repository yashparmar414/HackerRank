/*
 * This program finds Whether Entered number is Armstrong number or not?
 * https://www.hackerrank.com/contests/code-bloodedcoding-monopoly/challenges/easy-1-1-3
 * Mail :- yashparmar414@gmail.com
 * LinkedIn :- https://www.linkedin.com/in/yash-parmar-3aa06a195/
 * Hackerrank :- https://www.hackerrank.com/yashparmar414/
 * GitHub :- https://github.com/yashparmar414/
*/
import java.io.*;
import java.util.*;

public class Armstrong {

    public static void main(String[] args) {
        int n;
        int temp;
        int cube=0;
        int tempN;
        int digits=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        if(n<0)
        {
            n=Math.abs(n);
        }
        tempN=n;
        while (tempN != 0) 
        {
            digits++;
            tempN = tempN/10;
        }
        tempN=n;
        while(tempN!=0)
        {
            temp=tempN%10;
            temp=(int)(Math.pow(temp,digits));
            cube=cube+temp; 
            tempN=tempN/10;
        }
        if(n==cube)
        {
            System.out.println("Number Is Armstrong");
        }
        else
        {
            System.out.println("Number Is Not Armstrong");
        }
    }
}
