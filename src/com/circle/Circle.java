package com.circle;

//����Circle��
class Circle {		//��������Ĭ�Ϸ���Ȩ��
	private double radius;	//��Ա��������
	public Circle(double r) {	//���췽��������һ������ʵ����
		radius = r;
	}
	public void setRadius(double r) {	//�趨�뾶����Ա������������ʹ��
		radius = r;		//�ֲ��������������ڷ������ڣ�
	}
	public double getRadius() {		//��ð뾶
		return radius;
	}
	public double getArea() {	//�������
		final double PI = 3.14;
		double area;
		area = PI * radius * radius;
		return area;
	}
}
