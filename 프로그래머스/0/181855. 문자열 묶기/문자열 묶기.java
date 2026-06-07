class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        for(String s : strArr){
            if(answer < s.length()) answer = s.length();
        }
        int[] arr = new int[answer];
        for(int i = 0; i < strArr.length; i++){
            arr[strArr[i].length()-1]++;
        }
        answer = 0;
        for(int i : arr){
            if(answer < i) answer = i;
        }
        return answer;
    }
}