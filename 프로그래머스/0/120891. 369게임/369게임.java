class Solution {
    public int solution(int order) {
        int answer = 0;
        while(true){
            if(order > 9){
                switch (order % 10){
                    case 3,6,9 -> answer++;
                }
                order /= 10;
            }
            else{
                answer += order % 3 == 0 ? 1 : 0;
                break;
            }
        }
        return answer;
    }
}