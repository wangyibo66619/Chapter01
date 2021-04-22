package edu.xcdq.com;

/**
 * @author 王艺博
 * @date 2021/4/22 10:10
 */
public class testBall {
    public static void main(String[] args) {
        System.out.println(Ball.PI);
        Ball ball = new Ball();
        System.out.println(ball.PI);
        //Ball.PI = 6.14;
        System.out.println(Ball.PI);
        ball.calcZhouChang();
        ball.calcArea();

        Ball.calcArea();
        // Ball.calcZhouChang();
    }
}
