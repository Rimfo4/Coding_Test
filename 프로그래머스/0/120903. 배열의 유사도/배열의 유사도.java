class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        if(s1.length < s2.length){
            for(int i = 0; i < s1.length; i++){
                for(int j = s2.length-1; 0 <= j; j--){
                    if(s1[i].equals(s2[j])) answer++;
                }
            }
        }
        else
            for(int i = 0; i < s2.length; i++){
                for(int j = s1.length-1; 0 <= j; j--){
                    if(s2[i].equals(s1[j])) answer++;
                }
            }
        return answer;
    }
}