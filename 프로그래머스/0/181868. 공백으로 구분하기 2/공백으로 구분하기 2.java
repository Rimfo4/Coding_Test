class Solution {
    public String[] solution(String my_string) {
        String temp = "";
        
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == ' ' && temp.length() > 0){
                cnt++;
                temp = "";
            }
            else if(my_string.charAt(i) != ' '){
                temp += my_string.charAt(i);    
            }
        }
        if(temp.length() > 0){
            cnt++;  
        } 
        temp = "";
        String[] answer = new String[cnt];
        cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) == ' ' && temp.length() > 0){
                answer[cnt++] = temp;
                temp = "";
            }
            else if(my_string.charAt(i) != ' '){
                temp += my_string.charAt(i);    
            }
        }
        if(temp.length() > 0){
            answer[cnt] = temp;  
        } 
        return answer;
    }
}