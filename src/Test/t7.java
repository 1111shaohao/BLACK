package Test;
import java.util.Scanner;
public class t7 {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int b=sc.nextInt();
            sum+=b;
        }
        int a=sum/10;
        System.out.println(sum);
        System.out.println(a);
    }


}
