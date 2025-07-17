class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = 0;
        
        int i = n;
        if(n == 0) answer = 0;
        else{
            while(true){                // 자릿수 확인용 반복문
                if(i >= 10){
                    cnt++;
                    i = i / 10;
                } else break;
            }
            cnt += 1;                   // 자릿수
        
            while (true){
                i = cnt;
                int a = 1;
                while(i != 1){
                    a *= 10;
                    i--;
                }
                if(n > a){
                    answer += n / a;
                    n = n % a;
                }
                if(n < 10 && n > 0){
                    answer += n;
                    break;
                }
                cnt--;
            }
        }
        // if(n > 1000){
        //     answer += n / 1000;
        //     n = n % 1000;
        // }
        // if(n > 100){
        //     answer += n / 100;
        //     n = n % 100;
        // }
        // if(n > 10){
        //     answer += n / 10;
        //     n = n % 10;
        // }
        // if(n > 1){
        //     answer += n / 1;
        //     n = n % 1;
        // }
        return answer;
    }
}