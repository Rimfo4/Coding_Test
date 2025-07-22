class Solution {
    public String solution(String n_str) {
        String answer = "";
        int cnt = 0;
        for(int i = 0; i < n_str.length(); i++){
            if(cnt == 0)
                if(n_str.charAt(i) == '0') continue;
                else {
                    answer += n_str.charAt(i);
                    cnt++;
                }
            else answer += n_str.charAt(i);
        }
        return answer;
    }
}