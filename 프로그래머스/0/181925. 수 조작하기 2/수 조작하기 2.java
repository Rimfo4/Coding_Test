class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        int cnt = 0;
        
        for(int i = 0; i < numLog.length-1; i++){
            
            while(numLog[i] != numLog[i+1]){
                if(numLog[i] < numLog[i+1]){
                    numLog[i]++;
                    cnt++;
                }
                else if(numLog[i] > numLog[i+1]){
                    numLog[i]--;
                    cnt--;
                }
            }
            if(cnt == 1) answer += 'w';
            if(cnt == -1) answer += 's';
            if(cnt == 10) answer += 'd';
            if(cnt == -10) answer += 'a';
            cnt = 0;
            }
        return answer;
    }
}