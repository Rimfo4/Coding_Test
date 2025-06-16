class Solution {
    public int[] solution(int[] num_list) {
        int[] a = new int[num_list.length];
        int cnt = num_list.length-1;
        for(int i = 0; i < num_list.length; i++){
            a[cnt] = num_list[i];
            cnt--;
        } 
        return a;
    }
}