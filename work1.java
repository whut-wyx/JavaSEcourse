package cn.edu.whut.cst.jse;

import source.*;
public class work1
{
    private Circle circle2;
    private Square square1;

    public void practice1()
    {
        circle2 = new Circle();      //创建另一个圆

        square1=new Square();           //创建一个正方形
       // System.out.println("创建了");    测试代码
    }

    public static void main(String[] args)
    {
        work1 work1=new work1();
        work1.practice1();
    }
}
