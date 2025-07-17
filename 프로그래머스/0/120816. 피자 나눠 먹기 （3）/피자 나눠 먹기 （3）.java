class Solution {
    public int solution(int slice, int n) {
        int answer = 0;
        int copy = slice;
        
        while(slice / n < 1){
            slice += copy;
            answer++;
        }
        answer++;
        return answer;
    }
}