package com.circle;

//Circle������
public class CircleTest {
	public static void main(String[] args) {
		Circle c1, c2;	//����c1��c2ΪCircle����
		c1 = new Circle(10);	//����c1����new����һ������µĶ��󣬹��췽������ִ�У�
		c2 = new Circle(10);	//����c2������ͨ��new���ù��췽��Circle
		c2.setRadius(40); 	//����c2���޸İ뾶����������Ӱ��c1�ĳ�Ա����״̬
		System.out.println("c1�İ뾶=" + c1.getRadius() + "\tc2�İ뾶=" + c2.getRadius());
		System.out.println("c1�����=" + c1.getArea() + "\tc2�����=" + c2.getArea());	
	}

}