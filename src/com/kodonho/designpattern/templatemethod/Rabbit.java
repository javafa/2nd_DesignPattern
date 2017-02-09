package com.kodonho.designpattern.templatemethod;

public class Rabbit extends TemplateMethod {
	@Override
	public void jump() {
		System.out.println("±øÃÑ ±øÃÑ~");
	}

	@Override
	public void land() {
		System.out.println("¶Ù´Ù ³Ñ¾îÁ³½À´Ï´Ù");
	}
}
