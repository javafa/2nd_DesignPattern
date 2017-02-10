package com.kodonho.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * 옵저버를 관리하는 메인서버
 */
public class KakaoTalkServer {
	
	// 옵저버들을 저장해두는 저장소
	List<Observer> observers = new ArrayList<>();
	
	// 데이터 저장소
	public String data = "";
	
	// 옵저버 저장소에 옵저버를 저장하는 역할
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	// 변경사항이 발생했을때 옵저버들에게 통지하는 역할
	private void notification(){
		for(Observer observer:observers){
			observer.update();
		}
	}
	
	// 메시지 전달 함수
	public void sendMessage(String msg) {
		// 데이터 저장소에 데이터를 반영해준다
		data = msg;
		// 전달해야 되는 메시지가 발생하면 notification으로 모든 옵저버에게 알린다.
		notification();
	}
}
