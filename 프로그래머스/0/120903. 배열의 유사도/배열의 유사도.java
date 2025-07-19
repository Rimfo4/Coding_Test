class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        int big = s1.length > s2.length ? s1.length : s2.length;
        int small = s1.length <= s2.length ? s1.length : s2.length;
        
        if(s1.length < s2.length){
            for(int i = 0; i < small; i++){
                for(int j = big-1; 0 <= j; j--){
                    if(s1[i].equals(s2[j])) answer++;
                }
            }
        }
        else
            for(int i = 0; i < small; i++){
                for(int j = big-1; 0 <= j; j--){
                    if(s2[i].equals(s1[j])) answer++;
                }
            }
        return answer;
    }
}