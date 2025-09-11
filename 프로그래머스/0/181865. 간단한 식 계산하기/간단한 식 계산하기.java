class Solution {
    public int solution(String binomial) {
        char op = ' ';
        int A = 0;
        int B = 0;
        boolean flag = true;
        for(int i = 0; i < binomial.length(); i++){
            switch(binomial.charAt(i)){
                case '0','1','2','3','4','5','6','7','8','9' ->{
                    if(flag){
                        A *= 10;
                        A += (int)(binomial.charAt(i)-'0');  
                    }
                    if(!(flag)){
                        B *= 10;
                        B += (int)(binomial.charAt(i)-'0');  
                    }
                }
                case '+' -> op = '+';
                case '-' -> op = '-';
                case '*' -> op = '*'; //필요없음
                case ' ' -> flag = false;
            }
        }
        if(op == '+') A += B;
        else if(op == '-') A -= B;
        else A *= B;
        
        return A;
    }
}