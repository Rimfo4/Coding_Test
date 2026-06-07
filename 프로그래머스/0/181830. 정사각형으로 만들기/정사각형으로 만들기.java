class Solution {
    public int[][] solution(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        if(row < col) row = col;
        else col = row;
        int[][] answer = new int[row][col];
        
        for(int i = 0; i < answer.length; i++){
            if(i >= arr.length){
                break;
            }
            else{
                for(int j = 0; j < answer[i].length; j++){
                    if(j < arr[0].length){
                        answer[i][j] = arr[i][j];
                    }
                }
            }
        }
        return answer;
    }
}