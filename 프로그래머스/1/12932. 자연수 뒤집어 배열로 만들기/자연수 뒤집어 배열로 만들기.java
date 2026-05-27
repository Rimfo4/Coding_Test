class Solution {
    public int[] solution(long n) {
        long temp = n;
        int cnt = 1;
        while(temp > 9){
            temp /= 10;
            cnt++;
        }
        int[] answer = new int[cnt];
        temp = n;
        cnt = 0;
        while(temp > 9){
            answer[cnt] = (int)(temp % 10);
            temp /= 10;
            cnt++;
        }
        answer[answer.length-1] = (int)temp;
        return answer;
    }
}