class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        int sum = 2*a*b;
        int temp = b;
        while(temp > 9){        //자릿수
            temp /= 10;
            answer++;    
        }
        for(int i = 0; i < answer; i++) a *= 10;
        return answer = a+b >= sum ? a+b : sum;
    }
}