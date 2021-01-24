package Test;

public class t2 {
    public static void main(String[] args) {
        int [] str=new int [100];
        int n=1,sum=0;

        for (int i = 0; i <100 ; i++) {
            str[n-1]=n;
            sum+=n;
            n++;

        }
        System.out.println(sum);
    }


}
