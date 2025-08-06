class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i = 0; i < myString.length(); i++){
            switch(myString.charAt(i)/5){
                case 19,20,21,22,23,24 -> answer += (char)(myString.charAt(i)-32);
                    default -> answer += myString.charAt(i);
            }
        } 
        return answer;
    }
}