import java.util.*;
class Solution {
    public int solution(int n) {
        int solve = 0;
        String answer = "";
        int temp = n;
        while(temp > 2){
            answer += String.valueOf(temp % 3);
            temp /= 3;
        }
        answer += String.valueOf(temp % 3);
        // System.out.println(answer);
        int cnt = 0;
        for(int i = answer.length()-1; i >= 0; i--){
            // 0 == 48, 9 == 57
            temp = answer.charAt(i) - 48;
            solve += temp * Math.pow(3, cnt++);
        }
        return solve;
    }
}