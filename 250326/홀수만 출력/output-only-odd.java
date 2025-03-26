import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        for (int a = A; a <= B; a++) {
            if (a%2 == 1) {
                System.out.print(a+" ");
            }
        }


    }
}