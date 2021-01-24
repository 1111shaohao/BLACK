package Test;
import java.util.Scanner;
public class t5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a/100;
        int c=a/10%10;
        int d=a%10;
        if(a==b*b+c*c+d*d)
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
    }
}
