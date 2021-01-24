package gongyuebei;

public class leifa {
    int a;
    int b;
    public int f(int a,int b) {
        this.a = a;
        this.b = b;
        int rem;
        while (b > 0) {
            rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println("最大公约数是"+a);
        return a;
    }
}
