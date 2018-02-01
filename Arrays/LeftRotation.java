import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LeftRotation {

    static int[] leftRotation(int[] a, int d) {
       // Your code goes here
        int n = a.length;
        d %= n;
        int[] rotated = new int[n];
        for(int i=d; i<n; i++)
            rotated[i-d] = a[i];
        for(int i=n-d; i<n; i++)
            rotated[i] = a[i-n+d];
        return rotated;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
