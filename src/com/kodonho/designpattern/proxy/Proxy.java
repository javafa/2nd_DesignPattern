package com.kodonho.designpattern.proxy;
/*
 * Proxy
 * �����ڷν� 
 * �߰��� �ٸ� ��� �Ǵ� �䱸������ ó���� ��
 * Ŭ���̾�Ʈ ��û�� ���� ���������ʹ� �������� �ʰ� �״�� �����Ѵ�.
 */
public class Proxy {
	// 1. ���� ���� ������ ����
	private static Proxy instance = null;
	// 2. ������ ����
	private Proxy(){}
	// 3. instance�� üũ�ؼ� �Ѱ��ش�
	public static Proxy getInstance(){
		if(instance == null) {
			instance = new Proxy();
		}
		return instance;
	}
	
	public Bbs getBbs(int bbsno){
		Bbs bbs = Database.readBbs(bbsno);
		
		// ���������ʹ� �������� �ʰ� ��ȸ�� �Ǵ� ���ƿ� ���� ���������ش�
		Visit visit = new Visit();
		visit.increase(bbsno);
		
		return bbs;
	}
}
