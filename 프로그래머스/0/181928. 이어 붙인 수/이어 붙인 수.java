class Solution {
    public int solution(int[] num_list) {
        int cnt = 10;
        int sumJ = 0;
        int sumH = 0;
        for(int i = 0; i < num_list.length; i++){
            if(i == 0 && num_list[i]%2==0) sumJ = num_list[i];
            else if(i == 0 && num_list[i]%2==1) sumH = num_list[i];
            if(i > 0){
                if(num_list[i]%2==0) sumJ = (sumJ * cnt) + num_list[i];
                else sumH = (sumH * cnt) + num_list[i];
            }
        }
        return sumJ+sumH;
    }
}