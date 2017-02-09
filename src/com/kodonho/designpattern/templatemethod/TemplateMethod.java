package com.kodonho.designpattern.templatemethod;

/*
 * Template Method
 * �θ� Ŭ������ �߻�Ŭ������ ������ �Լ���
 * �ڽ� Ŭ�������� ������ �߻�޼��带 ȣ���ϴ� ����
 */
public abstract class TemplateMethod {
	public void play(){
		System.out.println("�÷��̰� ���۵˴ϴ�.");
		jump();
		land();
	}
	
	public abstract void jump();
	public abstract void land();
}
