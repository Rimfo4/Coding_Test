class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        int cnt = 1;                    //자릿수 체크용
        while(num > 9){                 //자릿수 구하는 반복문
            if(num%10 == k) answer = cnt;
            num /= 10;
            cnt++;
        }
        if(num%10 == k) answer = cnt;
        return answer == 0 ? --answer : cnt-(answer-1);
    }
}