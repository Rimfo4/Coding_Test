class Solution {
    public int[] solution(int[] num_list) {
        int cntJ = 0;
        int cntH = 0;
        for(int i = 0; i< num_list.length; i++){
            if(num_list[i]%2==0) cntJ++;
            else cntH++;
        }
        int[] a = {cntJ, cntH};
        return a;
    }
}