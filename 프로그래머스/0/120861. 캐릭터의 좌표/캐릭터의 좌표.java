class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0, 0};
        for(String input : keyinput){
            switch(input){
                case "left" -> answer[0] -= answer[0] != (board[0]/2)*-1 ? 1 : 0;
                case "right" -> answer[0] += answer[0] != board[0]/2 ? 1 : 0;
                case "up" -> answer[1] += answer[1] != board[1]/2 ? 1 : 0;
                default -> answer[1] -= answer[1] != (board[1]/2)*-1 ? 1 : 0;
            }
        }
        return answer;
    }
}