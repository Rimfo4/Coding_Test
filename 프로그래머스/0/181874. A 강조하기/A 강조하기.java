class Solution {
    public String solution(String myString) {
        String answer = "";
        for(int i =0; i < myString.length(); i++){
            switch (myString.charAt(i)) {
                case 'a' : answer += 'A';
                    break;
                case 66,67,68,69,70,71,72,73,74,75,76,77,78,79,80,81,82,83,84,85,86,87,88,89,90 :
                    answer += (char)(myString.charAt(i)+32);
                    break;
                default : answer += myString.charAt(i);
            }
        }
        return answer;
    }
}