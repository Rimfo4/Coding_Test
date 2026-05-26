class Solution {
    public int[] solution(int[] arr) {
        int bi = 1;
        while(arr.length > bi){
            bi = powBin(bi);
        }
        int[] answer = new int[bi];
        bi = 0;
        for(int a : arr){
            answer[bi++] = a;
        }
        return answer;
    }
    int powBin(int a){
        return a*2;
    }
}