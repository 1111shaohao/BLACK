package bank;
//创建一个父类银行用户
public class Account<a> {
    private String name;
   private String acc;
   private double money;

    public Account(String acc,String name,double money){
        this.acc=acc;
        this.name=name;
        this.money=money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAcc() {
        return acc;
    }

    public void setAcc(String acc) {
        this.acc = acc;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }



    public Account(){

    }



    //功能：存钱
    public void cun(double money){
        this.money+=money;
    }
    //功能：取钱
    public void qu(double money){
        if(this.money<money){
            System.out.println("余额不足");
        }else{
            this.money-=money;
        }
    }
    //功能：转账
    public void zhuan(double money,Account user){
        if(this.money<money){
            System.out.println("余额不足");
        }else{
            this.money-=money;
            user.money+=money;
        }
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", acc='" + acc + '\'' +
                ", money=" + money +
                '}';
    }
}

