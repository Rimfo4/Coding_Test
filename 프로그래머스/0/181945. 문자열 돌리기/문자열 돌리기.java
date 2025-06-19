import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0; i<a.length(); i++){
            char b = a.charAt(i);
            System.out.print(b+"\n");
        }
    }
}