class Solution {
    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num+1];
        for(int i = 0; start_num <= end_num; start_num++){
            answer[i] = start_num;
            i++;
        }
        return answer;
    }
}