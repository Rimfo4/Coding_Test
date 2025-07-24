class Solution {
    public int[] solution(int[] num_list, int n) {
        int cnt = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i >= n-1) cnt++;
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 0; i < num_list.length; i++) if(i >= n-1) answer[cnt++] = num_list[i];
        return answer;
    }
}