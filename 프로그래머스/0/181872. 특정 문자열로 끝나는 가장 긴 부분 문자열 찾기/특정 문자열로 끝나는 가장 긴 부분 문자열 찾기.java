class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int Index = 0;
        for(int i = 0; i < myString.length() - pat.length()+1; i++){
            if(myString.charAt(i) == pat.charAt(0)){
                boolean flag = false;
                for(int j = 0; j < pat.length(); j++){
                    if(myString.charAt(i+j) != pat.charAt(j)){
                        flag = true;
                    }
                }
                if(!flag) Index = Index < i+pat.length() ? i+pat.length() : Index;
            }
        }
        for(int i = 0; i < Index; i++){
            answer += myString.charAt(i);
        }
        return answer;
    }
}