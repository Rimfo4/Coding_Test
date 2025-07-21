class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int sum = 0;
        if(a%2==1 && b%2==1)
            sum = (a*a) + (b*b);
        else if(a%2==1 || b%2==1)
            sum = 2*(a + b);
        else {
            if(a < b) 
                sum = b - a;
            else if(a > b) 
                sum = a - b;
        }
        return sum;
    }
}