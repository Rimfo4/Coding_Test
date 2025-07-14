class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        
        for(int i = 0; i < sides.length-1; i++){      //내림차순 버블 정렬
            for(int j = 0; j < sides.length-(1+i); j++){
                if(sides[j] < sides[j+1]){
                    int temp = sides[j];
                    sides[j] = sides[j+1];
                    sides[j+1] = temp;
                }
            }
        }
        return answer = sides[0] < sides[1] + sides[2] ? 1 : 2;
    }
}