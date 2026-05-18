class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        String str = A;
        for(int i = 0; i < A.length(); i++){ //for문 다 돌고 나온다 => B가 될 수 없다.
            if(str.equals(B)) return i == 0 ? 0 : i; 
            String temp = "";
            temp += str.charAt(str.length()-1);
            for(int j = 1; j < str.length(); j++){
                temp += str.charAt(j-1);
            }
            str = temp;
        }
        return answer;
    }
}