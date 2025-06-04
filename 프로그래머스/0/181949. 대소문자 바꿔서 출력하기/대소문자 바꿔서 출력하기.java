import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String sum = "";
        char b;
        
        for(int i = 0; i < a.length(); i++){
            b = a.charAt(i);
            if(64 < b && b < 91) sum += (char)(b+32);
            else if(96 < b && b < 123) sum += (char)(b-32);
        }
        System.out.print(sum);
    }
}