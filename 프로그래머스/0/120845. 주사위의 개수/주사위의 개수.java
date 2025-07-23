class Solution {
    public int solution(int[] box, int n) {
        box[0] /= n;
        box[1] /= n;
        box[2] /= n;
        
//         for(int i = 0; i < box.length; i++) if(box[i] >= n) box[i] /= n;
        return box[0]*box[1]*box[2];
    }
}