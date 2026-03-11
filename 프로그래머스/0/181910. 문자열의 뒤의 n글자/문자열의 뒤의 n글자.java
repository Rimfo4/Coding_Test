class Solution {
    public String solution(String my_string, int n) {
        int cut = my_string.length()-n;
        String answer = "";
        for(; cut < my_string.length(); cut++)
            answer += my_string.charAt(cut);
        return answer;
    }
}