class Solution {
    public int solution(int[] sides) {
        int cnt = 0;
        
        int big = sides[0] < sides[1] ? sides[1] : sides[0];
        int small = sides[0] > sides[1] ? sides[1] : sides[0];
        
        int standard = big - small;
        
        while (true) {          //big이 가장 긴 변인 경우
            if(big > standard){
                standard += 1;
                cnt++;
            }
            else{
                break;
            }
        }
        standard = (big + small) - 1;
        while (true) {          //나머지 한 변이 가장 긴 변인 경우
            if(big < standard){
                cnt++;
                standard -= 1;
            }
            else{
                break;
            }
        }
        return cnt;
    }
}