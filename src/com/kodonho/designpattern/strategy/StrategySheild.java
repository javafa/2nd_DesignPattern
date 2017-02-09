package com.kodonho.designpattern.strategy;

public class StrategySheild implements Strategy {

	@Override
	public void runStrategy() {
		bothHands();
		System.out.println("막는다~");
	}
	
	private void bothHands(){
		System.out.println("양손으로 방패을 잡고");
	}
}
