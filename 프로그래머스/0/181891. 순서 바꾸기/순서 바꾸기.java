class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length];
        int Fcnt = 0;
        int Tcnt = 0;
        
        for(int i = 0; i < num_list.length; i++){
            
            if(i < n){
                Fcnt++;
            }
            else{
                answer[Tcnt] = num_list[i];
                Tcnt++;
            }
        }
        for(int i = 0; i < Fcnt; i++){
            answer[Tcnt] = num_list[i];
            Tcnt++;
        }
        return answer;
    }
}