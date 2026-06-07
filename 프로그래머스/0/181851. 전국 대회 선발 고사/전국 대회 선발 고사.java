import java.util.*;
class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        for(boolean b : attendance){
            if(b) answer++;
        }
        int[][] arr = new int[answer][2];
        answer = 0;
        for(int i = 0; i < rank.length; i++){
            if(attendance[i]) {
                arr[answer][0] = rank[i];    
                arr[answer][1] = i;
                answer++;
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int min = arr[0][0];
        for(int i = 0; i < arr.length-1; i++){
            for(int j = 0; j < arr.length-1-i; j++){
                if(arr[j][0] > arr[j+1][0]){
                    int value = arr[j+1][0];
                    int index = arr[j+1][1];
                    arr[j+1][0] = arr[j][0];
                    arr[j+1][1] = arr[j][1];
                    arr[j][0] = value;
                    arr[j][1] = index;
                }
            }
        }
        answer = arr[0][1]*10000 + arr[1][1]*100 + arr[2][1];
        return answer;
    }
}