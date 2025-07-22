class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        int sum = 0;
        for(int i = 0; i < num_list.length; i++){
            sum += num_list[i];
            answer *=num_list[i];
        }
        return answer  = answer < (sum*sum) ? 1 : 0;
    }
}