import java.util.Scanner;

public class Main {
    static int n, min = Integer.MAX_VALUE;
    static int [][] food;
    static boolean[] visited;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        food = new int[n][2];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            food[i][0] = sc.nextInt(); // 신맛
            food[i][1] = sc.nextInt(); // 쓴맛
        }

        dfs(0);
        System.out.println(min);

    }

    static void dfs(int depth) {
        if (depth == food.length) {
            int sour = 1;
            int butter = 0;
            int count = 0;

            for (int i = 0; i < visited.length; i++) {
                if (visited[i]) {
                    count++;
                    sour*=food[i][0]; // 신맛
                    butter+=food[i][1]; // 쓴맛
                }
            }

            // 아무 음식도 선택되지 않은 경우는 return
            if (count == 0)
                return;
            // 최솟값 갱신
            min = Math.min(min, Math.abs(sour-butter));
            return;
        }

        // 현재 음식은 선택한 경우 탐색
        visited[depth] = true;
        dfs(depth + 1);

        // 현재 음식은 선택하지 않은 경우 탐색
        visited[depth] = false;
        dfs(depth + 1);
    }
}
