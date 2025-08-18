import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }
        int big = A[0];
        int small = A[0];
        for(int i = 0; i < A.length; i++) {
            if(big < A[i]) big = A[i];
            if(small > A[i]) small = A[i];
        }
        System.out.print(small+" "+big);
    }
}
