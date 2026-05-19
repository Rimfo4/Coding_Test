class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        String str = "";
        String strPat = "";
        for(int i = 0; i < myString.length(); i++){
            if(myString.charAt(i) < 97){
                str += (char)(myString.charAt(i)+32);
            }
            else str += myString.charAt(i);
        }
        for(int i = 0; i < pat.length(); i++){
            if(pat.charAt(i) < 97){
                strPat += (char)(pat.charAt(i)+32);
            }
            else strPat += pat.charAt(i);
        }
        int cnt = 0;
        for(int i = 0; i < str.length() - strPat.length()+1; i++){
            int index = i;
            for(int j = 0; j < strPat.length(); j++){
                if(str.charAt(index) == strPat.charAt(j)){
                    cnt++;
                    index++;
                }
                if(cnt == strPat.length()) return 1;
            }  
            cnt = 0;
        }
        return answer;
    }
}