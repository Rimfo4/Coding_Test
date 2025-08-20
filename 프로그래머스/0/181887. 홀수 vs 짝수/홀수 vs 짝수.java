class Solution {
    public int solution(int[] num_list) {
        int J = 0;
        int H = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i%2 == 0) H += num_list[i];
            else J += num_list[i];
        }
        return H < J ? J : H;
    }
}