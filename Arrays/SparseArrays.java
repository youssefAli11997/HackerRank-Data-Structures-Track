import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        String word = "";
        int n,q;
        n = in.nextInt(); in.nextLine();
        for(int i=0; i<n; i++){
            word = in.nextLine();
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        q = in.nextInt(); in.nextLine();
        for(int i=0; i<q; i++){
            word = in.nextLine();
            System.out.println(map.getOrDefault(word, 0));
        }
    }
}
