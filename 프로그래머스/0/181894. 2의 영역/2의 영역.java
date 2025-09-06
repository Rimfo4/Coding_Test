class Solution {
    public int[] solution(int[] arr) {
        int min = 0;
        int max = 0;
        int cnt = 0;
        boolean FirstSecond = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 2 && FirstSecond){
                min = i;
                FirstSecond = false;
            }
            if(arr[i] == 2 && max < i) max = i;
            else if(arr[i] != 2) cnt++;
        }
        if(cnt == arr.length){
            int[] answer = {-1};
            return answer;
        }
        int[] answer = new int[max-min+1];
        cnt = 0;
        for(int i = 0; i < arr.length; i++){
            if(min <= i && max >= i){
                answer[cnt] = arr[i];
                cnt++;
            }
        }
        return answer;
    }
}