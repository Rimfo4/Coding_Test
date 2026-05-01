import java.util.*;
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        int temp = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) >= 48 && my_string.charAt(i) <= 57){
                for(int j = i; j < my_string.length(); j++){
                    if(my_string.charAt(j) >= 48 && my_string.charAt(j) <= 57){
                        temp *= 10;
                        temp += my_string.charAt(j) - 48;
                        if(j == my_string.length()-1){
                            i = j;
                            answer += temp;
                            temp = 0;
                            break;
                        }
                    }
                    else{
                        i = j;
                        answer += temp;
                        temp = 0;
                        break;
                    }
                }
            }
        }
        return answer;
    }
}