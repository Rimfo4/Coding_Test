class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int cnt = 1;
        int a;
        int sum = 0;
        
        for(int i = bin1.length()-1; i >= 0; i--){         // 문자열 bin1을 2진수를 10진수로 변환
            switch(bin1.charAt(i)){
                case '0' : a = 0;
                    break;
                case '1' :
                    a = 1;
                    sum += a * cnt;
                    break;
            }      
            cnt *= 2;
        }
        System.out.println(sum);
        cnt = 1;
        for(int i = bin2.length()-1; i >= 0; i--){         // 문자열 bin2을 2진수를 10진수로 변환
            switch(bin2.charAt(i)){
                case '0' : a = 0;
                    break;
                case '1' : 
                    a = 1;
                    sum += a * cnt;
                    break;
            }      
            cnt *= 2;
        }
        while(true){                                    // 합친 10진수 2진수로 변환
            if(sum >= 2){
                if(sum % 2 == 1){ 
                    answer += "1";
                    sum /= 2;
                }
                else if(sum % 2 == 0) {
                    answer += "0";
                    sum /= 2;
                }
                
            }
            else{
                answer += sum;
                break;
            }
        }
        System.out.println(answer);
        String result = "";
        
        for(int k = answer.length()-1; k >= 0; k--){
            result += answer.charAt(k);
        }
        return result;
    }
}