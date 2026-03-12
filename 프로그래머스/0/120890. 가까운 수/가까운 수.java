class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int gap = (array[0]-n) < 0 ? (array[0]-n)*-1 : (array[0]-n);
        
        for(int i = 0; i < array.length; i++){
            int temp = (array[i]-n) < 0 ? (array[i]-n)*-1 : (array[i]-n);
            if(gap > temp){
                gap = temp;
                answer = i;        
            }
            else if(gap == temp){
                answer = array[answer] > array[i] ? i : answer;
            }
            System.out.println(gap);
        }
        return array[answer];
    }
}