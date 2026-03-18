class Solution {
    public int solution(String str1, String str2) {
        int cnt = 0;
//         char nextT = ' ';
//         for(int i = 0; i < str2.length(); i++){
//             for(int j = 0; j < str1.length(); j++){
//                 if(str1.charAt(j) == str2.charAt(i)){
//                     if(str1.charAt(j+1) != str1.length()-1){
//                         nextT = str1.charAt(j+1);  
//                     }
//                     else break;
//                     cnt++;
//                     break;
//                 }
//                 else cnt = 0;
//             }
//         }
        
//         System.out.print(cnt);
        // cnt == str1.length() ? 1 : 0
        
        return str2.contains(str1) ? 1 : 0;
    }
}