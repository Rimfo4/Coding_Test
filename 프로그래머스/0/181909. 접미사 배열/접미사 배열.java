import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        String[] answer = new String[my_string.length()];
        String str = my_string;
        for(int i = 0; i < answer.length; i++){
            answer[i] = "";
            for(int j = i; j < str.length(); j++){
                answer[i] += str.charAt(j);
            }
        }
        System.out.println(Arrays.toString(answer));
        for(int i = 0; i < answer.length-1; i++){
            for(int j = 0; j < answer.length-1-i; j++){
                String temp = "";
                int jLen = answer[j].length();
                int jpLen = answer[j+1].length();
                //a, ana 이렇게 있으면 -> 작은 문자열의 크기까지 비교 했는데 같다면 -> 길이 더 큰게 뒤로
                int min = jLen < jpLen ? jLen : jpLen;
                boolean charF = false;
                boolean lenF = false;
                
                int index = 0;
                for(; index < min; index++){
                    if(answer[j].charAt(index) != answer[j+1].charAt(index)){
                        charF = true;
                        break;
                    }
                }
                if(!charF) lenF = true;
                
                if(charF){
                    if(answer[j].charAt(index) > answer[j+1].charAt(index)){
                        temp = answer[j];
                        answer[j] = answer[j+1];
                        answer[j+1] = temp;
                    }
                }
                else if(lenF){
                    if(jLen > jpLen){
                        temp = answer[j];
                        answer[j] = answer[j+1];
                        answer[j+1] = temp;
                    }
                }
            }
        }
        return answer;
    }
}