class Solution {
    public String solution(String my_string, String letter) {
        String[] answer = new String[my_string.length()];
        String a = "";
        
        for(int i = 0; i < answer.length; i++){
            answer[i] = my_string.charAt(i)+"";    
            if(!(answer[i].equals(letter)))
                a += answer[i];
        }    
        return a;
    }
}