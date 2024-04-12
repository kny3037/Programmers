import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        List<Integer> list = new ArrayList<>();
        
        // 기능 배포에 걸리는 시간
        int[] days = new int[progresses.length];
        
        for(int i = 0; i < speeds.length; i++) {
            days[i] = (100-progresses[i])/speeds[i];
            
            if((100-progresses[i]) % speeds[i] != 0) {
                days[i] += 1;
            }
        }
        
        int x = days[0];
        int count = 1;
        
        for(int i = 1; i < progresses.length; i++) {
            if(x >= days[i]) {
                count += 1;
            } else {
                list.add(count);
                count = 1;
                x = days[i];
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}