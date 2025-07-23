class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i = 0; i < my_string.length(); i++){
            switch(my_string.charAt(i)/5){
                case 12,13,14,15,16,17,18 -> answer += (char)(my_string.charAt(i)+32);
                case 19,20,21,22,23,24 -> answer += (char)(my_string.charAt(i)-32);
            }
        }
        return answer;
    }
}