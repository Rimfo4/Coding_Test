import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < before.length(); i++){
            map.put(before.charAt(i), map.getOrDefault(before.charAt(i), 0)+1);
        }
        for(int i = 0; i < after.length(); i++){
            // ||연산자는 왼쪽을 판별 후 오른쪽으로 가기에 null인지 비교가 먼저이다.
            if(map.get(after.charAt(i)) == null || map.get(after.charAt(i)) <= 0){
                answer = 0;
                break;
            }
            else{
                map.put(after.charAt(i), map.get(after.charAt(i))-1);
            }
        }
        return answer;
    }
}