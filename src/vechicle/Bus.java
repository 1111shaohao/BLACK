package vechicle;

public  class Bus implements Vechicle {
    public void start(int v1){
        System.out.println("公交车的启动速度为："+v1);
    }
    public void stop(int v2){
        System.out.println("公交车的刹车速度为"+v2);
    }
}
