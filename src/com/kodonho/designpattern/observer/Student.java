package com.kodonho.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observer {
	
	KakaoTalkServer server;
	String name="";
	
	public Student(KakaoTalkServer server,String name){
		this.server = server;
		server.addObserver(this);
		this.name = name;
	}

	// 메시지를 보관하는 저장소
	List<String> messages = new ArrayList<>();
	
	@Override
	public void update(String msg) {
		messages.add(msg);
		showMessage();
	}
	
	// 타이핑을 통해 입력되는 메시지
	public void addMessage(String msg) {
		server.sendMessage(msg);
	}
	
	public void showMessage() {
		System.out.println(name+"에게 온 메시지:" + messages.get(messages.size()-1));
	}
}
