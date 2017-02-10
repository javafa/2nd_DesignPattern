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

	// �޽����� �����ϴ� �����
	List<String> messages = new ArrayList<>();
	
	@Override
	public void update() {
		// ������Ʈ�� �Ͼ�� �ٶ󺸰� �ִ� ������ �����͸� �ݿ��Ѵ�
		String msg = server.data;
		messages.add(msg);
		showMessage();
	}
	
	public void showMessage() {
		System.out.println(name+"���� �� �޽���:" + messages.get(messages.size()-1));
	}
}
