class Solution {
    public String solution(String s) {
        
        String answer = "";
        int cnt = 0;
        String[] strArr = s.split("");
        
        for(String ss : strArr) {
            
            if(ss.contains(" ")){
                cnt = 0;
            } else {
                cnt++;
            }
            
            if(cnt%2 == 0){
               answer += ss.toLowerCase();
            }else {
                answer += ss.toUpperCase();
            }
            
        }
        
        return answer;
    }
}