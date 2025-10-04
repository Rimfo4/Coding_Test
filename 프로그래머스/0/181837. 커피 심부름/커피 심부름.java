class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for(String i : order){
            switch(i){
                case "iceamericano","americanoice","americano","hotamericano", "americanohot","anything" -> answer += 4500;
                default -> answer += 5000;
            }
        }
        return answer;
    }
}