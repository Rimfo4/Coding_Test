class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        int a = 0;
        int b = 0;
        for(int i = 0; i < str1.length()*2; i++){
            if(i==0){ 
                answer += str1.charAt(a);
                a++;
            }
            else if(i%2==1){ 
                answer += str2.charAt(b);   
                b++;
            }
            else{
                answer += str1.charAt(a);
                a++;
            }
        }
        
        return answer;
    }
}