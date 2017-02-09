package com.kodonho.designpattern.templatemethod;

/*
 * Template Method
 * 부모 클래스인 추상클래스에 구현된 함수가
 * 자식 클래스에서 구현된 추상메서드를 호출하는 패턴
 */
public abstract class TemplateMethod {
	public void play(){
		System.out.println("플레이가 시작됩니다.");
		jump();
		land();
	}
	
	public abstract void jump();
	public abstract void land();
}
