class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        int temp = (a*a)+(b*b)+(c*c);
        int temp2 =(a*a*a)+(b*b*b)+(c*c*c);
        if(a!=b && b!=c && a!=c) answer = a+b+c;
        else if(a==b && b==c && a==c) answer = (a+b+c) *temp * temp2; 
        else answer = (a+b+c) * temp;
        return answer;
    }
}