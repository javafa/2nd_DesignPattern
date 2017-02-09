package com.kodonho.designpattern.factorymethod;

/*
 * Factory Method
 * ��ü�� �������ִ� ����
 * Ȯ���� �θ�Ŭ������ �޼��带 �������̵��ؼ� ��ȯ���ش�.
 */
public abstract class FactoryMethod {
	public abstract Product make();
	public abstract Packed pack(Product product);
}
