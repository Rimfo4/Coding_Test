class Solution {
    public int solution(int n) {
        int sum = 0;
        if(n%2==0){
            for(; n != 0; n -= 2)
                sum += n;
        }else {
            n-=1;
            for(; n != 0; n -= 2)
                sum += n;
        }
            
        return sum;
    }
}