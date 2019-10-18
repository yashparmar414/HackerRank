import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr, int n) {
    // Write your code here
        int sum1=0,sum2=0;
        int k=(n-1);
        System.out.println("For 1st Diagonal");                        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    List<Integer> l1=arr.get(i);
                    System.out.println(l1);    
                    System.out.println(l1.get(i));
                    sum1=sum1+l1.get(i);
                    System.out.println(sum1);
                }
                if(i+j==(n-1) && k>=0)
                {
                    List<Integer> l1=arr.get(i);
                    System.out.println(l1);    
                    System.out.println(l1.get(j));
                    sum2+=l1.get(j);
                    System.out.println(sum2);
                    k--;
                }
            }
        }
        int result=Math.abs(sum1-sum2);
        return result;
    }
}

public class DiagonalMatrixSquareDifferance {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arrRowItems = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                int arrItem = Integer.parseInt(arrRowTempItems[j]);
                arrRowItems.add(arrItem);
            }

            arr.add(arrRowItems);
        }

        int result = Result.diagonalDifference(arr,n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
