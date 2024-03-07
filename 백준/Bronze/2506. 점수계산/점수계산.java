import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] problem = new int[N];
        
        for(int i = 0; i < N; i++) {
            problem[i] = sc.nextInt();
        }
        
        int total = 0;
        int count = 0;
        
        for(int i : problem) {
            if(i == 1) {
                count++;
                total+=count;
            } else {
                count = 0;
            }
        }
        
        System.out.println(total);
    }
}