class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        
        boolean answer = true;
        boolean x = true;
        boolean y = true;
        
        if(x1 == true){
            x = true;
        }else if(x1 == false) {
            if(x2 == true) {
                x = true;
            } else {
                x = false;
            }
        }
        
        if(x3 == true){
            y = true;
        }else {
            if(x4 == true) {
                y = true;
            } else {
                y = false;
            }
        }
       
        if(x == true) {
            if(y == true) {
                answer = true;
            } else {
                answer = false;
            }
        } else {
            if(y == true) {
                answer = false;
            }else {
                answer = false;
            }
        }
        
        return answer;
    }
}