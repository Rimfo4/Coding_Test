class Solution {
    public int[] solution(String myString) {
        int cnt = 1;
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 'x') cnt++;
        }
        int[] answer = new int[cnt];
        
        cnt = 0;
        int cnt2 = 0;
        for(int i = 0; i < myString.length(); i++){
            if(i == myString.length()-1 && myString.charAt(i) != 'x') answer[cnt2] = ++cnt;
            if(myString.charAt(i) == 'x'){
                answer[cnt2] = cnt;
                cnt = 0;
                cnt2++;
            }
            else cnt++;
        }
        return answer;
    }
}