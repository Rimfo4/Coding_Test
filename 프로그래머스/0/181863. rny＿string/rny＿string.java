class Solution {
    public String solution(String rny_string) {
        String answer = "";
        for(int i = 0; i < rny_string.length(); i++)
            answer += (rny_string.charAt(i)=='m') ? "rn" : rny_string.charAt(i);
        return answer;
    }
}