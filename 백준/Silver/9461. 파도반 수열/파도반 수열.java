import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        long p[] = new long[101];

        p[1] = p[2] = p[3] = 1;
        p[4] = p[5] = 2;

        for (int i = 6; i <= 100; i++) {
            p[i] = p[i-1] + p[i-5];
        }
        for (int tn = 1; tn <= T; tn++) {
            System.out.println(p[sc.nextInt()]);
        }
    }
}
