import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        
        for(int i = 0; i < s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        char[] keyArr = new char[map.size()];
        int i = 0;
        for(char c : map.keySet()){
            keyArr[i++] = c;
        }
        System.out.print(keyArr);
        Arrays.sort(keyArr);
        for(char key : keyArr){
            if(map.get(key) == 1) answer += key;
        }
        System.out.print(map.keySet());
        System.out.print(map.values());
        System.out.print(map.entrySet());
        return answer;
    }
}