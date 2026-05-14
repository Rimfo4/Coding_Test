import java.util.*;
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for(int i = 0; i < dic.length; i++){
            if(dic[i].length() == spell.length){
                String str = "";
                for(int j = 0; j < dic[i].length(); j++){
                    str += dic[i].charAt(j);   
                }
                System.out.println(Arrays.sort(str));
                // if(Arrays.sort(str).equlse(Arrays.sort(dic[i]) ) ) answer = 1;
            }
        }
        return answer;
    }
}