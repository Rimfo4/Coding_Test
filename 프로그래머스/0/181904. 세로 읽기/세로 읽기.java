class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        String atemp = "";
        int cnt = 0;
        for(int i = 0; i < my_string.length(); i++){
            if(cnt < m){
                atemp += my_string.charAt(i);
                cnt++;
            }
            else{
                System.out.print(atemp+"@");
                answer += atemp.charAt(c-1);
                cnt = 1;
                atemp = "";
                atemp += my_string.charAt(i);
            }
        }
        answer += atemp.charAt(c-1);
        return answer;
    }
}