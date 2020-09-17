package cn.edu.whut.cst.jse;

import source.*;

import javax.print.attribute.standard.PresentationDirection;

public class work1
{
    private Circle circle2;
    private Square square1;
    private Triangle triangle1;
    private Picture picture1;

    public void practice1()
    {
        circle2 = new Circle();         //创建另一个圆
        circle2.changeColor("black");
        circle2.moveHorizontal(180);
        circle2.moveVertical(-10);
        circle2.changeSize(60);
        circle2.makeVisible();


        square1=new Square();      //创建一个正方形
        square1.changeColor("yellow");
        square1.moveHorizontal(100);
        square1.moveVertical(80);
        square1.makeVisible();

       // System.out.println("创建了");    测试代码
    }

    public void practice2()
    {
        circle2.moveDown();
        circle2.moveDown();
        circle2.makeInvisible();
        circle2.makeInvisible();
    }

    public void practice3()
    {
        circle2.moveVertical(1);
        circle2.slowMoveVertical(1);
        circle2.changeSize(1);
        circle2.moveHorizontal(-70);       //左移70个像素
    }

    public void practice4()
    {
        circle2.changeColor("red");
    }

    public void practice5()
    {
        circle2.changeColor("orange");
    }

    public void practice6()
    {
        circle2.changeColor("red");
        System.out.println("练习1-6：输入颜色时不加双引号，程序不能编译");
    }

    public void practice9()
    {
        picture1=new Picture();
        picture1.draw();
    }
    public void practice10()
    {
        picture1.draw();
        picture1.setBlackAndWhite();
        picture1.setColor();
    }

    public static void main(String[] args)
    {
        work1 work1=new work1();
        work1.practice1();
        work1.practice2();
        work1.practice3();
        work1.practice4();
        work1.practice5();
        work1.practice6();
        work1.practice9();
        work1.practice10();
    }
}
