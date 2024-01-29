import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = sc.nextInt();
        int[] status = new int [total];

        for (int i = 0; i < total; i++) {
            status[i] = sc.nextInt();
        }

        int student = sc.nextInt();

        for (int j = 0; j < student; j++) {

            int gender = sc.nextInt();
            int number = sc.nextInt();

            if (gender == 1) {  // 남학생일 경우

                for (int i = 0; i < total; i++) {
                    if ((i + 1) % number == 0) {
                        status[i] = status[i] == 0 ? 1 : 0;
                    }
                }
            }else if (gender == 2){  // 여학생일 경우

                int left = number - 1;
                int right = number - 1;

                // 좌우 대칭 구간 찾기
                while ((left - 1 >= 0) && (right + 1 < total) && (status[left - 1] == status[right + 1])) {
                    left--;
                    right++;
                }

                // 스위치 상태 변경
                for (int i = left; i <= right; i++) {
                    status[i] = status[i] == 0 ? 1 : 0;
                }

            }

        }

        for (int i = 0; i < total; i++) {
            System.out.print(status[i] + " ");
            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
    }
}
