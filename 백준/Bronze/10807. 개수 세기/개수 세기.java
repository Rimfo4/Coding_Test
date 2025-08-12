import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        N = 0;
        for (int i = 0; i < arr.length; i++) if(arr[i] == v) N++;
        System.out.print(N);
    }
}
