import java.util.*;
class Solution {
    public int solution(int[] array) {
        //Map 컬렉션 사용
        //Map.put()은 키가 이미 있으면, 값을 덮음.
        int answer = 0;
        int maxFreq = 0;
        int check = 0;
        
        Map<Integer, Integer> data = new HashMap<>();
        for(int i : array){
            int cnt = data.getOrDefault(i, 0)+1;
            data.put(i, cnt);
            
            if(cnt > maxFreq){
                maxFreq = cnt; 
                answer = i; //i == key
            }
        }
        for(int i : data.values()){
            if(i == maxFreq) check++;
        }
        return check == 1 ? answer : -1;
    }
}