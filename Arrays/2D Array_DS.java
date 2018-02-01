import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 6, max = -100, sum = 0;
        int[][] g = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                g[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i<n-2; i++){
            for(int j=1; j<n-1; j++){
                sum = g[i][j] + g[i][j+1] + g[i][j-1] + g[i+1][j] + g[i+2][j] + g[i+2][j+1] + g[i+2][j-1];
                max = Math.max(max, sum);
            }
        }
        System.out.println(max);
    }
}
