class Solution {
    public int solution(int n, String control) {
        int cnt = 0;
        while(cnt != control.length()){
            switch(control.charAt(cnt)){
                case 'w' : n += 1;
                    break;
                case 's' : n += -1;
                    break;
                case 'd' : n += 10;
                    break;
                case 'a' : n += -10;
            }
            cnt++;
        }
        return n;
    }
}