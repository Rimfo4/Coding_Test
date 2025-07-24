class Solution {
    public int solution(String number) {
        int answer = 0;
        for(int i = 0; i < number.length(); i++)
            if(number.charAt(i) == '1') answer += 1;
            else if(number.charAt(i) == '2') answer += 2;
            else if(number.charAt(i) == '3') answer += 3;
            else if(number.charAt(i) == '4') answer += 4;
            else if(number.charAt(i) == '5') answer += 5;
            else if(number.charAt(i) == '6') answer += 6;
            else if(number.charAt(i) == '7') answer += 7;
            else if(number.charAt(i) == '8') answer += 8;
            else if(number.charAt(i) == '9') answer += 9;
        return answer % 9;
    }
}