import java.util.Scanner;

public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        long max = Integer.MIN_VALUE;
        long[] cumArr = new long[n+1];
        for(int i = 0; i < m; i++){
            int a = in.nextInt(); a--;
            int b = in.nextInt();
            long k = in.nextLong();
            cumArr[a] += k;
            cumArr[b] -= k;
        }
        in.close();
        for(int i=1; i<n; i++){
            cumArr[i] += cumArr[i-1];
            max = max < cumArr[i] ? cumArr[i] : max;
        }
        System.out.println(max);
    }
}
