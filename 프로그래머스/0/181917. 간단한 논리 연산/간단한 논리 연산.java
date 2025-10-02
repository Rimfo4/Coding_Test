class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean X = false;
        boolean Y = false;
        if(x1 || x2 && true) X = true;
        if(x3 || x4 && true) Y = true;
        return answer = (X && Y == true) ? true : false;
    }
}