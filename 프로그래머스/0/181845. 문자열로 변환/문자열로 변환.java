class Solution {
    public String solution(int n) {
        String answer = "";
        int cnt = 1;
        int fake = n;
        while(fake > 9){
            fake /= 10;
            cnt++;
        }
        int[] arr = new int[cnt];
        fake = n;
        int i = 0;
        while(fake > 9){
            arr[i] = fake % 10;
            System.out.println(arr[i]);
            fake /= 10;
            i++;
        }
        arr[cnt-1] = fake;
        System.out.println(arr[cnt-1]);
        
        for(int j = arr.length-1; j >= 0; j--){
            switch(arr[j]){
                case 0 -> answer += "0";
                case 1 -> answer += "1";
                case 2 -> answer += "2";
                case 3 -> answer += "3";
                case 4 -> answer += "4";
                case 5 -> answer += "5";
                case 6 -> answer += "6";
                case 7 -> answer += "7";
                case 8 -> answer += "8";
                case 9 -> answer += "9";
            }
        }
        return answer;
    }
}