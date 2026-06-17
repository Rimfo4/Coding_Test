class Solution {
    public int[] solution(int num, int total) {
        // total/num 값을 num개 만큼 쪼개야함 => total = 15, num = 5 면 => 3,3,3,3,3 이렇게 쪼개리는 거임.
        int[] answer = new int[num];
        
        int mid = total/num;
        int center = (num%2==1) ? num/2 : num/2-1;
        answer[center] = mid; 
        for(int i = 0; i < answer.length; i++){
            if(center == i) continue;
            answer[i] = mid-(center)+i;
        }
        return answer;
    }
}