class Solution {
    public int solution(int hp) {
        int answer = 0;
        final int king = 5;
        final int att = 3;
        final int work = 1;
        
        if(hp >= 5){
            answer += hp / king;
            hp %= king;
        }
        if(hp >= 3){
            answer += hp / att;
            hp %= att;
        }
        answer += hp;
    return answer;
    }
}