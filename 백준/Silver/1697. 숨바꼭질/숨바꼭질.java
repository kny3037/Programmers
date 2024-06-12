
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    private static final int MAX_STEP = 100001; 

    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 수빈이 위치
        int k = sc.nextInt(); // 동생 위치

        // 방문 여부 저장
        boolean[] visited = new boolean[MAX_STEP];
        
        // 걸음 수 저장
        int[] dp = new int[MAX_STEP];
        
        // 수빈이가 갈 수 있는 방식들을 저장하는 큐
        Queue<Integer> subinPosQ = new LinkedList<>();
        visited[n]=true;
        subinPosQ.add(n);

        while(!subinPosQ.isEmpty()){
            // get one
            int nowPos = subinPosQ.poll();

            // set moving array
            int[] moves = {nowPos+1, nowPos-1, nowPos*2};

            // moving
            for(int step : moves){
                // 범위 체크
                if(step<0 || MAX_STEP<=step) continue;

                // 방문 체크
                if (visited[step]) continue;
                visited[step] = true;

                // 걸음수 설정
                dp[step] = dp[nowPos]+1;

                // 발견하면 나오도록
                if(k==step) break;

                // 큐에 추가
                subinPosQ.add(step);
            }
        }

        System.out.println(dp[k]);

    }

}