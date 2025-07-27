class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int cnt = 1;
        int sum1, sum2;
        int a1 = a;
        int b1 = b;
        if(a < b){
            // a ⊕ b
            int temp = b;
            while(temp > 9){   //자릿수       
                temp /= 10;
                cnt++;
            }
            for(int i = 0; i < cnt; i++) a *= 10;
            sum1 = a + b;
            // b ⊕ a
            cnt = 1;
            temp = a1;
            while(temp > 9){
                temp /= 10;
                cnt++;
            }
            for(int i = 0; i < cnt; i++) b1 *= 10;
            sum2 = b1 + a1;
        }
        else{
            // b ⊕ a
            int temp = a;
            while(temp > 9){   //자릿수       
                temp /= 10;
                cnt++;
            }
            for(int i = 0; i < cnt; i++) b *= 10;
            sum1 = a + b;
            // b ⊕ a
            cnt = 1;
            temp = b1;
            while(temp > 9){
                temp /= 10;
                cnt++;
            }
            for(int i = 0; i < cnt; i++) a1 *= 10;
            sum2 = b1 + a1;
        }
        return answer = sum1 > sum2 ? sum1 : sum2;
    }
}