class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        int temp = 0;
        int cnt = 0;
        for(int i = 0; i < intStrs.length; i++){
            for(int j = 0; j < l; j++){
                temp *= 10;
                switch(intStrs[i].charAt(j+s)){
                    case '0' -> temp += 0;
                    case '1' -> temp += 1;
                    case '2' -> temp += 2;
                    case '3' -> temp += 3;
                    case '4' -> temp += 4;
                    case '5' -> temp += 5;
                    case '6' -> temp += 6;
                    case '7' -> temp += 7;
                    case '8' -> temp += 8;
                    case '9' -> temp += 9;
                }
            }
            if(temp > k) cnt++;
            temp = 0;
        }
        int[] answer = new int[cnt];
        cnt = 0;
        for(int i = 0; i < intStrs.length; i++){
            for(int j = 0; j < l; j++){
                temp *= 10;
                switch(intStrs[i].charAt(j+s)){
                    case '0' -> temp += 0;
                    case '1' -> temp += 1;
                    case '2' -> temp += 2;
                    case '3' -> temp += 3;
                    case '4' -> temp += 4;
                    case '5' -> temp += 5;
                    case '6' -> temp += 6;
                    case '7' -> temp += 7;
                    case '8' -> temp += 8;
                    case '9' -> temp += 9;
                }
            }
            if(temp > k){
                answer[cnt] = temp;  
                cnt++;
            }
            temp = 0;
        }
        return answer;
    }
}