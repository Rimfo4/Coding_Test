class Solution {
    public String solution(String my_string) {
        String answer = "";
        char[] arr = new char[my_string.length()];
        for(int i = 0; i < my_string.length(); i++){
            if(my_string.charAt(i) > 64 && my_string.charAt(i) < 91) arr[i] = (char)(my_string.charAt(i)+32);
            else arr[i] = my_string.charAt(i);
        }
        for(int i = arr.length-1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(arr[j] > arr[j+1]){
                    char temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}