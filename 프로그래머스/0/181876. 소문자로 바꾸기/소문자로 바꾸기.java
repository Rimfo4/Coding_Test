class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
           if(myString.charAt(i) > 64 && myString.charAt(i) < 91){
               answer += (char)(myString.charAt(i)+32);
           }else answer += myString.charAt(i);
        }
        return answer;
    }
}