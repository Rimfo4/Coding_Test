class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) == 65){
                str += 'B';
            }
            else str += 'A';
        }
        
        int cnt = 0;
        for(int i = 0; i < str.length()-pat.length()+1; i++){
            int k = i;
            for(int j = 0; j < pat.length(); j++){
                if(str.charAt(k) == pat.charAt(j)){
                    cnt++;
                    k++;
                }
                if(cnt == pat.length()) return 1;
            }
            cnt = 0;
        }
        return answer;
    }
}