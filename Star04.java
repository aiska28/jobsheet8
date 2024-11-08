import java.util.Scanner;

public class Star04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter The value N = ");
        int N = sc.nextInt();

        // for(int i=1; i<=N; i++) {
        //     System.out.print("*");
        // }

        // for(int i = 0; i<=N; i++) {
        //     System.out.print("*");
        // }

        // for(int i = 1; i>N; i++) {
        //     System.out.print("*");
        // }

        for(int i = 1; i<=N; i--) {
            System.out.print("*");
        }
    }
}