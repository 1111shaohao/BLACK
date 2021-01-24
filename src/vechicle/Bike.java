package vechicle;

public class Bike implements Vechicle {
    public void start(int v1){
        System.out.println("自行车的启动速度为："+v1);
    }
    public void stop(int v2){
        System.out.println("自行车的刹车速度为"+v2);
    }

}
