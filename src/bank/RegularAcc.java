package bank;
import java.util.Date;
public class RegularAcc extends Account {
    private Date cunDate;
    private Date quDate;
    private int year;

    public RegularAcc(String acc, String name, double money,int year) {
        super(acc, name, money);
        cunDate =new Date();
        this.year=year;

    }



    @Override
    public void cun(double money) {
        System.out.println("该用户不能存钱");
    }

    @Override
    public void zhuan(double money, Account user) {
        System.out.println("该用户不能转账");
    }

    @Override
    public void qu(double money) {
        quDate=new Date();
        if(quDate.getTime()-cunDate.getTime()/(1000*3600*24*365)==year){
            if(money == getMoney()){
                setMoney(0);
                System.out.println("取钱成功");
            }else{
                System.out.println("必须把钱全部取出");
            }
        }else{
            System.out.println("时间不够");
        }
    }
}
