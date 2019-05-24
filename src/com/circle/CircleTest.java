package com.circle;

//Circle测试类
public class CircleTest {
	public static void main(String[] args) {
		Circle c1, c2;	//声明c1和c2为Circle对象
		c1 = new Circle(10);	//创建c1（用new创建一个类的新的对象，构造方法立即执行）
		c2 = new Circle(10);	//创建c2（必须通过new引用构造方法Circle
		c2.setRadius(40); 	//调用c2的修改半径方法，并不影响c1的成员变量状态
		System.out.println("c1的半径=" + c1.getRadius() + "\tc2的半径=" + c2.getRadius());
		System.out.println("c1的面积=" + c1.getArea() + "\tc2的面积=" + c2.getArea());	
	}

}