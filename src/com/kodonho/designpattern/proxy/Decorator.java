package com.kodonho.designpattern.proxy;
/*
 * Decorator
 * Proxy�� ����� ������ ����������
 * Ŭ���̾�Ʈ ��û�� ���� ���������͸� ������ �� �����Ѵ�.
 */
public class Decorator {
	// 1. ���� ���� ������ ����
	private static Decorator instance;
	// 2. ������ ����
	private Decorator(){}
	// 3. instance�� üũ�ؼ� �Ѱ��ش�
	public static Decorator getInstance(){
		if(instance == null){
			instance = new Decorator();
		}
		return instance;
	}
	// 4. �����Լ� getBbs ����
	public BbsExtend getBbs(int bbsno){
		BbsExtend bbs = Database.readBbsExtend(bbsno);
		// ���� �����͸� �����ͼ� ������ �� �Ѱ��ش�.
		bbs.count = bbs.count + 1;
		bbs.title = "����:" + bbs.title;
		return bbs;
	}
	
}
