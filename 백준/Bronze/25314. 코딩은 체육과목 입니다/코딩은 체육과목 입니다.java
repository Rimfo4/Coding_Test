import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(; N > 0; N = N-4){
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
