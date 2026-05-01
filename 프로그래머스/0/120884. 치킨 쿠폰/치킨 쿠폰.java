class Solution {
    public int solution(int chicken) {
        //치킨 1 == 쿠폰 1개, 쿠폰 10 = 서비스 치킨 1, 서비스 치킨 1 == 쿠폰 1
        int answer = 0;
        int ck = chicken;
        
        while(ck > 9){
            int coupon = ck % 10;
            ck = ck / 10;
            answer += ck;
            ck += coupon;
        }
        return answer;
    }
}