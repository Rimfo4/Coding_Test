class Solution {
    public int solution(int n) {
        int answer = 0;
        int piece = 6;
        while(piece % n != 0){
            piece += 6;
            answer++;
        }
        return answer+1;
    }
}