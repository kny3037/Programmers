import java.util.HashSet;
import java.util.Scanner;

public class Main {
    
    static int N, K;
    static int[] arr;
    static HashSet<String> list = new HashSet<>();
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        K = sc.nextInt();
        visited = new boolean[N];
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        BT(0, "");
        System.out.println(list.size());
    }
    public static void BT(int depth, String s) {
        if (depth == K) {
            list.add(s);
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                visited[i] = true;
                BT(depth+1, s+arr[i]);
                visited[i] = false;
            }
        }
    }

}
