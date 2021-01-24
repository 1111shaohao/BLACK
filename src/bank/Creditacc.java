package bank;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

public class Creditacc extends Account{
    private  double touMoney;
    private double maxMoney;
    public Creditacc(String acc, String name, double money,double touMoney) {
        super(acc, name, money);
        this.touMoney=touMoney;
        setMoney(getMoney()+touMoney);
        this.maxMoney=touMoney;
    }

    @Override
    public void zhuan(double money, Account user) {
        System.out.println("该用户不能转账");
    }

    @Override
    public void qu(double money) {
        if(getMoney()<money){
            System.out.println("余额不足");
        }else{
            if(money >= touMoney){
               setMoney(getMoney() -(money-touMoney));
                touMoney=0;
            }else{
                touMoney-=money;
            }
            System.out.println("你的余额为"+getMoney()+"透支额度为"+touMoney);
        }

    }

    @Override
    public void cun(double money) {
        if(touMoney<maxMoney){
            if(touMoney+money>=maxMoney){
                money=money-(maxMoney-touMoney);
                touMoney=maxMoney;
                setMoney(getMoney()+money);
            }else{
                touMoney+=money;
            }
            System.out.println("你的余额为"+getMoney());
        }else{
            setMoney(getMoney()+money);
            System.out.println("你的余额为"+getMoney());
        }

    }



}
