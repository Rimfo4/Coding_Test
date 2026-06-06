import java.util.*;
class Solution {
    public String[] solution(String myString) {
        int cnt = 0;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x' && (i != 0 && i != myString.length()-1)){
                cnt++;
            }
        }
        String[] arr = new String[cnt+1];
        cnt = 0;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) != 'x'){
                str.append(myString.charAt(i));
            }
            else if(i != 0){
                arr[cnt++] = str.toString();
                str.delete(0, str.length());
            }
        }
        if(myString.charAt(myString.length()-1) != 'x'){
            arr[cnt++] = str.toString();
        }
        Arrays.sort(arr);
        cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != "") cnt++;
        }
        String[] answer = new String[cnt];
        cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != "") answer[cnt++] = arr[i];
        }
        return answer;
    }
}