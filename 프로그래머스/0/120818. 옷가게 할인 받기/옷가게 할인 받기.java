class Solution {
    public int solution(int price) {
        
        double sum = 0;
        switch(price/100000){
            case 5,6,7,8,9,10: sum = price*0.2;
                break;
            case 3,4: sum = price*0.1;
                break;
            case 1,2: sum = price*0.05;
        }
        price -= sum;
        return price;
    }
}