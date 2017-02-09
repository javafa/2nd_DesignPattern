package com.kodonho.designpattern.singleton;
/*
 * Singleton
 * �̱��� ������ �ڿ��� �����ϱ� ���� �������� ����Ѵ�. 
 * Multi-Thread ȯ�濡���� �Ʒ� ������ ����ȭ�� �߰��ؾ� �Ѵ�.
 */
public class Singleton {
	// �̱��� �ڽ��� ��Ƶδ� ��������
	private static Singleton instance = null;
	
	private Singleton(){  } // new ����� ���ϰ� �Ѵ�

	public static Singleton getInstance(){
		// 1. instance ������ ���� �ִ����� üũ�ϰ� ������ �����Ѵ�.
		//    �����ڰ� private������ ����class�ȿ� �ֱ� ������ new�� �� �� �ִ�.
		if(instance == null){
			instance = new Singleton();
		}
		// 2. instance �� �����Ѵ�
		return instance;
	}
	
	public String name="";
}







