class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[(start_num+1) - end_num];
        int cnt = 0;
        for(int i = start_num; i != end_num-1; i--){
            answer[cnt] += i;
            cnt++;
        }
        return answer;
    }
}