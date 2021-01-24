package Shape;

public  class Circle implements Figure{
    public void area(double r){
        System.out.println("圆的面积为"+Math.PI*r*r);
    }
}
