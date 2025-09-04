class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int sum = 0;
        int cnt = 0;
        while(cnt < 2){
            for(int i = intervals[cnt][0]; i <= intervals[cnt][1]; i++) sum++;
            cnt++;
        }
        int[] answer = new int[sum];
        
        sum = 0;
        cnt = 0;
        while(cnt < 2){
            for(int i = intervals[cnt][0]; i <= intervals[cnt][1]; i++){
                answer[sum] = arr[i];
                sum++;
            }
            cnt++;
        }
        return answer;
    }
}