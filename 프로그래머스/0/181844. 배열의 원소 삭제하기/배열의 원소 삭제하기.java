class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++)
            for(int j = 0; j < delete_list.length; j++)
                if(arr[i] == delete_list[j]) cnt++;
        int[] answer = new int[arr.length-cnt];
                
        cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < delete_list.length; j++){
                if(arr[i] == delete_list[j]) cnt2++;
            }
            if(cnt2 == 0){
                answer[cnt] = arr[i];
                cnt++;
            }
            cnt2 = 0;
        }
        return answer;
    }
}