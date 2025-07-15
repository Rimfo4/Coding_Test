class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        int gijun = ((num1 - num2)*-1)+1;
        
        int[] answer = new int[gijun];
        int cnt = 0;
        
        for(int i = 0; i < numbers.length; i++){
            
            if(i >= num1 && i <= num2){
                answer[cnt] = numbers[i];
                cnt++;
            }
        }
        return answer;
    }
}