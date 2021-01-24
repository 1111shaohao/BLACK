package Test;
import java.util.Scanner;
public class t4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int c=0;
        if(a<=1)
        {
            System.out.println("no");
        }
        else if(a==2)
        {
            System.out.println("yes");
        }
        else
        {
            for (int i = 2; i < a; i++) {
                if(a%i==0)
                {
                    System.out.println("no");
                }


        }
            System.out.println("yes");

        }

    }


}
