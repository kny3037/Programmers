import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        boolean arr[] = new boolean[N+1];

        arr[0] = true;
        arr[1] = true;

        for (int i = 2; i < Math.sqrt(N+1); i++) {
            for (int j = i*i; j < N+1; j+=i) {
                arr[j] = true;
            }
        }

        for (int i = M; i < N+1; i++) {
            if (arr[i] == false) {
                System.out.println(i);
            }
        }

    }
}
