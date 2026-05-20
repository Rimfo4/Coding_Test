class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String str = my_string;
        String[] arr = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            arr[i] = "";
            for(int j = i; j < my_string.length(); j++){
                arr[i] += str.charAt(j);
            }
        }
        for(String s1 : arr){
            if(is_suffix.equals(s1)) return 1;
        }
        return answer;
    }
}