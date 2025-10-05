class Solution {
    public String solution(int age) {
        String answer = "";
        while(age > 9){
            int temp = age % 10;
            answer += (char)(temp+97);
            age /= 10;
        }
        answer += (char)(age+97);
        String ans = "";
        for(int i = answer.length()-1; i >= 0; i--){
            ans += answer.charAt(i);
        }
        return ans;
    }
}