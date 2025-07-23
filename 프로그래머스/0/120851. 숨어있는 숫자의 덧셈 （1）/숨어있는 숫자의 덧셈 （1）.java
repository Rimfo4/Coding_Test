class Solution {
    public int solution(String my_string) {
        int answer = 0;
        for(int i = 0; i< my_string.length(); i++){
            switch(my_string.charAt(i)){
                case '1' -> answer += 1;
                case '2' -> answer += 2;
                case '3' -> answer += 3;    
                case '4' -> answer += 4;
                case '5' -> answer += 5;
                case '6' -> answer += 6;
                case '7' -> answer += 7;
                case '8' -> answer += 8;
                case '9' -> answer += 9;
            }
        }
        return answer;
    }
}