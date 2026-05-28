import java.util.*;
class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        int cnt = 0;
        Arrays.sort(indices);
        System.out.print(Arrays.toString(indices));
        for(int i = 0; i < my_string.length(); i++){
            if(i != indices[cnt] && indices.length > cnt){
                answer += my_string.charAt(i);
            }
            else if(indices.length-1 > cnt)cnt++;
        }
        return answer;
    }
}