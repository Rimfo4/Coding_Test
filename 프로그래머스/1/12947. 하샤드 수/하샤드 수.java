class Solution {
    public boolean solution(int x) {
        boolean answer = false;
        int a = x;
        int sum = 0;
        
        while(x > 9){
            sum += x % 10;
            x /= 10;
        }
        sum += x;
        
        if(a%sum==0) answer = true;
        return answer;
    }
}