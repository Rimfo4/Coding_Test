class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean flagIn, flagOut;
        if(ineq.equals(">")) flagIn = true;
        else flagIn = false;
        if(eq.equals("=")) flagOut = true;
        else flagOut = false;
        
        if(true == flagIn && true == flagOut && n >= m) answer = 1;
        else if(false == flagIn && true == flagOut && n <= m) answer = 1;
        else if(true == flagIn && false == flagOut && n > m) answer = 1;
        else if(false == flagIn && false == flagOut && n < m)answer = 1;
        return answer;
    }
}