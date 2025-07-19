class Solution {
    public int[] solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) if(n%i==0) answer++;        //배열 길이용
        int[] arr = new int[answer];
        answer = 0;
        for(int i = 1; i <= n; i++) 
            if(n%i==0){
                arr[answer] = i;
                answer++;
            }
        return arr;
    }
}