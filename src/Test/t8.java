package Test;
import java.util.Scanner;
public class t8 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int p=(a+b+c)/2;
       int  n= p*(p-a)*(p-b)*(p-c);
       double S=Math.sqrt(n);
        System.out.println(p);
        System.out.println(S);
    }
}
