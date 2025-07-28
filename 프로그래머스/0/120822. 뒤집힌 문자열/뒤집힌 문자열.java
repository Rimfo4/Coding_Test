class Solution {
    public String solution(String my_string) {
        char[] arr = new char[my_string.length()];
        String a = "";
        for(int i = 0; i < arr.length; i++)arr[i] = my_string.charAt(i);   
        for(int i = arr.length-1; i >= 0; i--) a += arr[i];
        return a;
    }
}