class Solution {
    public int[] solution(int[][] score) {
        double[] answer = new double[score.length];
        //평균값 1차원 배열에 담기
        for(int i = 0; i < score.length; i++){
            answer[i] = (score[i][0]+score[i][1]);
            answer[i] /= 2;
        }
        //등수 배열
        int[] rank = new int[answer.length];
        for(int i = 0; i < answer.length; i++){
            rank[i]++;
            for(int j = 0; j < answer.length; j++){
                double temp = answer[i];
                if(temp < answer[j]) rank[i]++;
            }
        }
        return rank;
    }
}