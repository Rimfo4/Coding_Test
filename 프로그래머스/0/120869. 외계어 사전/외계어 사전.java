class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        //소문자이니까 아스키코드로 비교 해보기.
        int ascii = 0;
        for(int i = 0; i < spell.length; i++){
            ascii += spell[i].charAt(0)-96;
        }
        System.out.println(ascii);
        
        int dicAsc = 0;
        for(int i = 0; i < dic.length; i++){
            String str = dic[i];
            if(str.length() == spell.length){
                for(int j = 0; j < spell.length; j++){
                    dicAsc += str.charAt(j) - 96;
                }
                if(dicAsc == ascii) return 1;
                else dicAsc = 0;
            }
        }
        return answer;
    }
}