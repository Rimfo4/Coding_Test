class Solution {
    public int solution(String s) {
        int answer = 0;
        boolean sign = true;
        if(s.charAt(0) > 48 && s.charAt(0) <= 57) sign = false;
        
        for(int i = 0; i < s.length(); i++){
            if(i == 0 && sign) continue;
            answer *= 10;
            answer += s.charAt(i) - 48;
        }
        if(s.charAt(0) == '-'){
            return answer * -1;    
        }
        return answer;
    }
}