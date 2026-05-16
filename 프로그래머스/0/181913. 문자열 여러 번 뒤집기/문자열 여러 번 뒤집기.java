class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = my_string;
        for(int i = 0; i < queries.length; i++){
            String str = "";
            for(int j = 0; j < my_string.length(); j++){
                if(queries[i][0] == j){
                    for(int k = queries[i][1]; k >= j; k--){
                        str += answer.charAt(k);
                    }
                    j += queries[i][1]-queries[i][0];
                }
                else{
                    str += answer.charAt(j);
                }
            }
            answer = str;
        }
        return answer;
    }
}