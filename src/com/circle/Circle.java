package com.circle;

//定义Circle类
class Circle {		//类声明，默认访问权限
	private double radius;	//成员变量声明
	public Circle(double r) {	//构造方法（生成一个对象实例）
		radius = r;
	}
	public void setRadius(double r) {	//设定半径；成员方法的声明及使用
		radius = r;		//局部变量（作用域在方法体内）
	}
	public double getRadius() {		//获得半径
		return radius;
	}
	public double getArea() {	//计算面积
		final double PI = 3.14;
		double area;
		area = PI * radius * radius;
		return area;
	}
}
