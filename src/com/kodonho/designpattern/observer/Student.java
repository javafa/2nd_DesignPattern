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
	public void update() {
		// 업데이트가 일어나면 바라보고 있던 서버의 데이터를 반영한다
		String msg = server.data;
		messages.add(msg);
		showMessage();
	}
	
	public void showMessage() {
		System.out.println(name+"에게 온 메시지:" + messages.get(messages.size()-1));
	}
}
