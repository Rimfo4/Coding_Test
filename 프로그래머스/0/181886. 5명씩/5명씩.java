class Solution {
    public String[] solution(String[] names) {
        int gijun = names.length%5==0 ? names.length/5 : names.length/5+1;
        String[] answer = new String[gijun];
        int cnt = 0;
        for(int i = 0; i < names.length; i++){
            if(i==0 || i%5==0){
                answer[cnt] = names[i];
                cnt++;
            }else continue;
        }
        return answer;
    }
}