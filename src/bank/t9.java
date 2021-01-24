package bank;
import java.util.Scanner;
public class t9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = a(m, n);
        int b = b(m, n);
        System.out.println(a);
        System.out.println(b);
    }

    private static int b(int m, int n) {
        int i;
        for (i = 1; i <= n; i++) {
            if ((m * i) % n == 0)
                break;
        }
        return m * i;
    }


    private static int a(int m, int n) {
        if (n == 0)
            return m;
        else {
            return a(n, m % n);
        }
    }
}