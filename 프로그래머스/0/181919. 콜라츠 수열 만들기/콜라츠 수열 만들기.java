class Solution {
    public int[] solution(int n) {
        int cnt = 0;
        int a = n;
        while(n!=1){
            cnt++;
            if(n%2==0) n /= 2;
            else if(n%2==1) n = 3 * n + 1;
        }
        
        int[] answer = new int[cnt+1];
        cnt = 1;
        n = a;
        answer[0] = n;
        
        while(n!=1){
            if(n%2==0){
                n /= 2;
                answer[cnt] = n;
            }
            else if(n%2==1){ 
                n = 3 * n + 1;
                answer[cnt] = n;
            }
            cnt++;
        }
        return answer;
    }
}