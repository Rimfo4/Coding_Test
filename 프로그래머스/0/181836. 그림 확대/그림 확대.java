import java.util.*;
class Solution {
    public String[] solution(String[] picture, int k) {
        String[] str = new String[picture.length*k];
        //기존 1픽셀을 k만큼 왼쪽으로 늘리고 => 그럴 토대로 아래로 k만큼 늘리기.
    
        StringBuilder strB = new StringBuilder();
        
        for(int i = 0; i < picture.length; i++){
            for(int j = 0; j < picture[i].length(); j++){
                for(int index = 0; index < k; index++){
                    strB.append(picture[i].charAt(j));
                }
                
            }
            for(int j = 0; j < k; j++){
                str[j+(i*k)] = strB.toString();
            }
            strB.setLength(0);
        }
        return str;
    }
}