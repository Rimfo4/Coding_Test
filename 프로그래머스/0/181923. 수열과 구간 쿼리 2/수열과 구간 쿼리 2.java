class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        //k보다 크면서 가장 작은 값을 answer에 넣기
        int target = -1;
        for(int i : arr){
            target = (i > target) ? i : target;
        }
        int big = target;
        int cnt = 0;
        for(int i = 0; i < answer.length; i++){
            target = big;
            cnt = 0;
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(arr[j] > queries[i][2]){
                    target = (arr[j] < target) ? arr[j] : target;
                    cnt++;
                }
            }
            answer[i] = cnt == 0 ? -1 : target;
        }
        return answer;
    }
}