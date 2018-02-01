import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] agrs){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        int k,x,y;
        int lastAnswer = 0;
        ArrayList<Integer>[] seqList = new ArrayList[n];
        for(int i=0; i<n; i++){
            seqList[i] = new ArrayList<>();
        }

        for(int i=0; i<q; i++){
            k = in.nextInt();
            x = in.nextInt();
            y = in.nextInt();
            if(k == 1){
                seqList[(x ^ lastAnswer) % n].add(y);
            }
            if(k == 2){
                lastAnswer = seqList[(x ^ lastAnswer) % n].get(y % seqList[(x ^ lastAnswer) % n].size());
                System.out.println(lastAnswer);
            }
        }
    }
}
