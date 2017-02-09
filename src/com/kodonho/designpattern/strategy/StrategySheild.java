package com.kodonho.designpattern.strategy;

public class StrategySheild implements Strategy {

	@Override
	public void runStrategy() {
		bothHands();
		System.out.println("���´�~");
	}
	
	private void bothHands(){
		System.out.println("������� ������ ���");
	}
}
