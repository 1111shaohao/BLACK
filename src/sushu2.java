import java.util.Scanner;
public class sushu2 {
    public static void main(String[] args) {
        System.out.println("请输入数组个数");
        Scanner sc = new Scanner(System.in);
        int count =sc.nextInt();
        int[] a=new int[count];
        for(int i=1;i<count;i++){
            System.out.println("请输入第"+i+"个数");
            int j=sc.nextInt();
            a[i]=j;
        }
        for (int i=1; i<=100; i++) {
            for (int k = 2; k < Math.sqrt(i); k++) {
                if (a[i] % k == 0) {
                    break;
                } else {
                    System.out.println(a[i]);
                }

            }

        }
    }
}
