class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        //index가 k의 배수라면 1올리기
        for(int i = 0; i < queries.length; i++){
            for(int j = queries[i][0]; j <= queries[i][1]; j++){
                if(j == 0 || j % queries[i][2] == 0){
                    arr[j]++;
                }
            }
        }
        return arr;
    }
}