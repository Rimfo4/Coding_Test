class Solution {
    public int solution(int n) {
        int pan = 0;
        if(7 >= n)  pan = 1;
        else if(n%7==0)  pan = n/7;
        else pan = (n/7)+1;
        return pan;
    }
}