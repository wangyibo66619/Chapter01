package edu.xcdq.com;

/**
 * @author 王艺博
 * @date 2021/4/22 8:30
 */
public class Phone {

    public double width;// 宽
    public double high;// 高
    public int weight;// 重量
    public String color;// 颜色
    // 构造方法，用于在内存中创建对象
    public Phone() {
        System.out.println("我被构造了");
    }
    // 构造方法
    public Phone(double width,double high,int weight,String color) {
        this.width = width;
        this.high = high;
        this.weight = weight;
        this.color = color;
    }
    public void starUp() {
        System.out.println("手机在开机");
    }
    // 锁屏
    public void lockScreen() {
        System.out.println("手机在锁屏");
    }
    public String toString() {
        return "{" + this.width + this.high + this.weight + this.color + "}";
    }

    public boolean equals(Object object) {
        if ( this == object ) {
            return true;
        }
        if ( object instanceof Phone ) {
            Phone temp = (Phone) object;
            if ( temp.width == this.width && temp.high == ((Phone) object).high &&
                    this.weight == ((Phone) object).weight && this.color == temp.color) {
                return true;
            }else {
                return false;
            }
        }
        return false;
    }
}
