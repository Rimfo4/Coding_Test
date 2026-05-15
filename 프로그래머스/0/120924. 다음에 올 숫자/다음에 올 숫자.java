class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int d = common[1] - common[0]; // 등차수열 공차
        for(int i = 0; i < common.length-1; i++){
            if(common[i+1] - common[i] == d) {
                answer++;
            }
            else break; // 등차수열이 아니라는 것.
        }
        if(answer == common.length-1) return common[common.length-1] + d;
        
        double r = common[1] * (1.0 / common[0]); // 등비수열 공비
        
        return common[common.length-1] * (int)r;
    }
}