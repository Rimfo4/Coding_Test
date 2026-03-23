class Solution {
    public String solution(String letter) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
                          "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
                          "..-","...-",".--","-..-","-.--","--.."};
        String answer = "";
        String temp = "";
        for(int i = 0; i < letter.length(); i++){
            if(letter.charAt(i) == ' '){
                System.out.print(temp);
                for(int cnt = 0; cnt < morse.length; cnt++){
                    if(morse[cnt].equals(temp)) answer += (char)(cnt+97);
                }
                temp = "";   
            }
            else temp += letter.charAt(i);
        }
        for(int cnt = 0; cnt < morse.length; cnt++){
            if(morse[cnt].equals(temp)) answer += (char)(cnt+97);
        }
        return answer;
    }
}