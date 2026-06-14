import java.util.*;
class Solution {
    public long solution(String numbers) {
        long answer = 0;
        String[] num = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        List<Integer> list = new ArrayList<>();
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < numbers.length(); i++){
            str.append(numbers.charAt(i));
            if(str.toString().length() > 2){
                for(int j = 0; j < 10; j++){
                    if(num[j].equals(str.toString())){
                        list.add(j);
                        str.setLength(0);
                        break;
                    }
                }
            }
        }
        for(int i = 0; i < list.size(); i++){
            answer *= 10;
            answer += list.get(i);
        }
        return answer;
    }
}