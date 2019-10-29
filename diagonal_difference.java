import java.io.*;
import java.util.*;
import java.lang.Math.*;

class diagonal_difference
{        
    public static void main(String args[])
    {

       int sum1=0;
       int sum2=0;
       int arr[][]=new int[3][3];

        java.util.Scanner sc=new java.util.Scanner(System.in);

       for(int i=0;i<3;i++)
       {
        for(int j=0;j<3;j++)
        {
            arr[i][j]=sc.nextInt();
        }
       }

       for(int i=0;i<arr_rows;i++)
        {
            sum1=sum1+(arr[i][i]);
        }

        for(int i=arr_rows-1;i>=0;i--)
        {
            sum2=sum2+(arr[i][i]);
        }

        System.out.println(abs(sum1-sum2)); 
    }
}
