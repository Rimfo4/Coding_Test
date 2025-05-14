class Solution {
    public long solution(int a, int b) {
        long s , l, sum;
        sum = 0;
        s = (a<b) ? a : b;
        l = (a<b) ? b : a;
        
        for(long i=s; i<=l; i++){
            sum +=i;
        }
            
        return sum;
    }
}