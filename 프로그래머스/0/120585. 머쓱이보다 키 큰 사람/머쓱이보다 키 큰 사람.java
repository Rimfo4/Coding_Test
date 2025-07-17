class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
        int[] meosse = new int[array.length+1];
        
        for(int i =0; i < array.length; i++){
            meosse[i] = array[i];
        }
        meosse[array.length] = height;
        
        for(int i = array.length; i > 0; i--){                  // 내림차순 버블 정렬
            for(int j = 0; j < i; j++){
                if(meosse[j] < meosse[j+1]){
                    int temp = meosse[j];
                    meosse[j] = meosse[j+1];
                    meosse[j+1] = temp;
                }
            }
        }
        for(int i = 0; i < meosse.length; i++){
            if(height != meosse[i]) answer++;
            else break;
        }
        
        return answer;
    }
}