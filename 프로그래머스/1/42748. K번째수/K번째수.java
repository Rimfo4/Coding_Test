import java.util.*;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int first = commands[i][0]-1;
            int last = commands[i][1]-1;
            int key = commands[i][2]-1;
            int[] sliceArr = new int[last-first+1];
            int cnt = 0;
            for(int j = 0; j < array.length; j++){
                if(j >= first && j <= last){
                    sliceArr[cnt] = array[j]; 
                    cnt++;
                } 
            }
            // System.out.print(Arrays.toString(sliceArr));
            Arrays.sort(sliceArr);
            answer[i] = sliceArr[key];
        }
        return answer;
    }
}