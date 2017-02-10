package com.kodonho.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * �������� �����ϴ� ���μ���
 */
public class KakaoTalkServer {
	
	// ���������� �����صδ� �����
	List<Observer> observers = new ArrayList<>();
	
	// ������ �����
	public String data = "";
	
	// ������ ����ҿ� �������� �����ϴ� ����
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	// ��������� �߻������� �������鿡�� �����ϴ� ����
	private void notification(){
		for(Observer observer:observers){
			observer.update();
		}
	}
	
	// �޽��� ���� �Լ�
	public void sendMessage(String msg) {
		// ������ ����ҿ� �����͸� �ݿ����ش�
		data = msg;
		// �����ؾ� �Ǵ� �޽����� �߻��ϸ� notification���� ��� ���������� �˸���.
		notification();
	}
}
