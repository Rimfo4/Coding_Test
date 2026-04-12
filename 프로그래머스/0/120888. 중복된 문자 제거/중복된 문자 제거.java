import java.util.*;
class Solution {
    public String solution(String my_string) {
        String answer = "";
        //중복 없음, 순서 있음
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < my_string.length(); i++){
            set.add(my_string.charAt(i));
        }
        for(Character c : set){
            answer += c;    
        }
        return answer;
    }
}