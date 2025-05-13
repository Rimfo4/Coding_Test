class Solution {
    public int solution(int n, int k) {
        if(n>=10) k -= (n/10); 
        int sum = 12000*n;
        int sum2 = 2000*k;
        return sum+sum2;
    }
}