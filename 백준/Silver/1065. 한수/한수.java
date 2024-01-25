import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= N; i++) {
            if (i <= 99) {
                count += 1;
            }else if (i <= 999) {
                String[] num = Integer.toString(i).split("");
                if ((Integer.parseInt(num[1])-Integer.parseInt(num[0])) == (Integer.parseInt(num[2]) - Integer.parseInt(num[1]))) {
                    count += 1;  
                }
            }

        }

        System.out.println(count);

    }
}