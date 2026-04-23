import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[][] pattern = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };
        int[] cnt = new int[3];
        for(int i = 0; i < answers.length; i++){
            for(int j = 0; j < pattern.length; j++){
                if(answers[i] == pattern[j][i % pattern[j].length]) cnt[j]++;   
            }
        }
        int max = 0;
        for(int s : cnt){
            max = s > max ? s : max;
        }
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == max) result.add(i+1);
        }
        int[] arr = new int[result.size()];
        for(int i = 0; i < arr.length; i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}