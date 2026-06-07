class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for(int i = 0; i < str_list.length; i++){
            int cnt = 0;
            for(int j = 0; j < str_list[i].length() - ex.length()+1; j++){
                if(str_list[i].charAt(j) == ex.charAt(0)){
                    for(int k = 0; k < ex.length(); k++){
                        if(str_list[i].charAt(j+k) == ex.charAt(k)) cnt++;
                    }
                }
            }
            System.out.println(cnt + " " + ex.length());
            if(cnt < ex.length()) answer += str_list[i];
        }
        return answer;
    }
}