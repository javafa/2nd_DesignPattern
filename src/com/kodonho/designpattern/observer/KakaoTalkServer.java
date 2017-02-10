package com.kodonho.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/*
 * �������� �����ϴ� ���μ���
 */
public class KakaoTalkServer {
	
	// ���������� �����صδ� �����
	List<Observer> observers = new ArrayList<>();
	
	// ������ ����ҿ� �������� �����ϴ� ����
	public void addObserver(Observer observer){
		observers.add(observer);
	}
	
	// ��������� �߻������� �������鿡�� �����ϴ� ����
	private void notification(String msg){
		for(Observer observer:observers){
			observer.update(msg);
		}
	}
	
	// ��Ʃ��Ʈ�� ����ϴ� �޽��� ���� �Լ�
	public void sendMessage(String msg) {
		// �����ؾ� �Ǵ� �޽����� �߻��ϸ� notification���� ��� ���������� �˸���.
		notification(msg);
	}
}
