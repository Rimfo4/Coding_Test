class Solution {
    public int[] solution(int n, int k) {
        int[] answer = new int[n/k];
        int cnt = 0;
        
        for(int i = 0; i <= n; i++){
            if(i==0) continue;
            else if(i%k==0){
                    answer[cnt] = i;
                    cnt++;
            }
        }
        return answer;
    }
}