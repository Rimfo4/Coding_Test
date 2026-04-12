class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(int p = i; p <= j; p++){
            int temp = p;
            while(temp > 9){
                if(temp % 10 == k) answer++;
                temp /= 10;
            }
            if(temp == k ) answer++;
        }
        return answer;
    }
}