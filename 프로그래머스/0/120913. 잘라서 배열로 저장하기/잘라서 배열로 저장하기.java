class Solution {
    public String[] solution(String my_str, int n) {
        int size = my_str.length() / n;
        String[] answer = new String[my_str.length() % n == 0 ? size : size+1];
        
        String temp = "";
        int cnt = 0;
        for(int i = 0; i < my_str.length(); i++){
            if(i != 0 && i % n == 0){
                answer[cnt++] = temp;
                temp = "";
            }
            temp += my_str.charAt(i);
            if(i == my_str.length()-1){
                answer[cnt++] = temp;
            } 
        }
        return answer;
    }
}