package bank;
public class Test {
    public static void main(String[] args) {
        RegularAcc a1=new RegularAcc("002","李四",3000,3);
        Creditacc a2 = new Creditacc("001","张三",2000,1000);
         a1.qu(3000);
        a1.cun(5000);
        System.out.println("------------");
        a2.qu(1000);
        a2.cun(1000);
        }
    }

