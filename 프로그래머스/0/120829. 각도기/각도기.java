class Solution {
    public int solution(int angle) {
        if(angle<90){
           angle = 1; 
        }
        else if(angle == 90){
            angle = 2;
        }
        else if(angle<180){
            angle = 3;
        }
        else{
            angle = 4;
        }
        return angle;
    }
}