package Test;
import java.util.Scanner;
public class t10 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a=s(n);
        System.out.println(a);

    }
    private static int s(int i){
        if(i==0||i==1)
        {
            return 1;
        }
        else
        {
            return s(i-1)+s(i-2);
        }
    }


}
