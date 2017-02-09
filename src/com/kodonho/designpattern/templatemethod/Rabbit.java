package com.kodonho.designpattern.templatemethod;

public class Rabbit extends TemplateMethod {
	@Override
	public void jump() {
		System.out.println("���� ����~");
	}

	@Override
	public void land() {
		System.out.println("�ٴ� �Ѿ������ϴ�");
	}
}
