class Solution {
    public int[] solution(String my_string) {
        int answer = 0;
        for(int i = 0; i < my_string.length(); i++)
            switch(my_string.charAt(i)) {
                case '0','1','2','3','4','5','6','7','8','9' : answer++;
            }
        int[] arr = new int[answer];
        answer = 0;
        for(int i = 0; i < my_string.length(); i++){
            switch(my_string.charAt(i)) {
                case '0' : arr[answer] = 0;
                    answer++;
                    break;
                case '1' : arr[answer] = 1;
                    answer++;
                    break;
                case '2' : arr[answer] = 2;
                    answer++;
                    break;
                case '3' : arr[answer] = 3;
                    answer++;
                    break;
                case '4' : arr[answer] = 4;
                    answer++;
                    break;
                case '5' : arr[answer] = 5;
                    answer++;
                    break;
                case '6' : arr[answer] = 6;
                    answer++;
                    break;
                case '7' : arr[answer] = 7;
                    answer++;
                    break;
                case '8' : arr[answer] = 8;
                    answer++;
                    break;
                case '9' : arr[answer] = 9;
                    answer++;
            }
        }
        for(int i = arr.length-1; i > 0; i--)
            for(int j = 0; j < i; j++)
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
        return arr;
    }
}