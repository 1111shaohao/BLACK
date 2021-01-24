package gongyuebei;

public class leizi extends leifa{
    @Override
    public int f(int a, int b) {
        int m = super.f(a,b);
        System.out.println("最小公倍数是"+(a*b)/m);
        return (a*b)/m;
    }


}
