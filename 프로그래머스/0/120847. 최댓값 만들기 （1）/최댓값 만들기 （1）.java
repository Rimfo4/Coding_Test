import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int big = 0;
        int small = 0;
        
        Arrays.sort(numbers);
        
//         for(int i = 0; i < numbers.length; i++){
//             if(big < numbers[i]) big = numbers[i];
//         }
        
//         for(int i = 0; i < numbers.length; i++){
//             if(big == numbers[i]){
//                 continue;
//             }
//             else if(small < numbers[i]){
//                 small = numbers[i];
//             }
//         }
        return numbers[numbers.length-1]* numbers[numbers.length-2];
    }
}