import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int i = 0;
        int count = 0;

        while (count < X) {
            i++;
            count += i;  // 몇 번째 행인지
        }

        int position = count - X;  // 행의 몇 번째 자리에 있는지
        int position2 = (count - i) - X + 1;

        if (i % 2 == 0) {
            System.out.println((i - position) + "/" + (i + position2));
        } else  {
            System.out.println((i+position2 + "/" + (i - position)));
        }
    }
}
