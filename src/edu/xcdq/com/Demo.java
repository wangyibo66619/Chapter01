package edu.xcdq.com;

/**
 * @author 王艺博
 * @date 2021/4/22 8:33
 */
public class Demo {
    public static void main(String[] args) {
        Phone iphoneSE3 = new Phone();
        iphoneSE3.width = 25;
        iphoneSE3.high = 55;
        iphoneSE3.weight = 155;
        iphoneSE3.color = "玫瑰金";

        Phone onePlus = new Phone(26,56,156,"琥珀蓝");
        System.out.println(iphoneSE3);
        System.out.println(onePlus);

        Phone xiaomi12 = new Phone();
        Phone xiaomi13 = new Phone();
        System.out.println(xiaomi12 == xiaomi13);
    }
}
