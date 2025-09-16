class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = new String[strArr.length];
        for(int i = 0; i < strArr.length; i++){
            answer[i] = "";
            for(int j = 0; j < strArr[i].length(); j++){
                if(i%2==0){
                    if(strArr[i].charAt(j)>96 && strArr[i].charAt(j) < 123)
                        answer[i] += strArr[i].charAt(j);
                    else answer[i] += (char)(strArr[i].charAt(j)+32);  
                }  
                else{
                    if(strArr[i].charAt(j)>96 && strArr[i].charAt(j) < 123)
                        answer[i] += (char)(strArr[i].charAt(j)-32);
                    else answer[i] += strArr[i].charAt(j);  
                }
            }
        }
        return answer;
    }
}