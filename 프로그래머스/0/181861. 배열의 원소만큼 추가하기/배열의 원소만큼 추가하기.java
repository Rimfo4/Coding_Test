class Solution {
    public int[] solution(int[] arr) {
        int cnt = 0;
        for(int i = 0; i < arr.length; i++){
            cnt += arr[i];
        }
        int[] answer = new int[cnt];
        cnt = 1;      //값 넣기용
        int cnt2 = 0; //arr 배열용
        for(int i = 0; i < answer.length; i++){
            if(cnt == arr[cnt2]){
                answer[i] = arr[cnt2];
                cnt = 1;
                cnt2++;
            }
            else{
                answer[i] = arr[cnt2];
                cnt++;
            }
        }
        return answer;
    }
}