package com.kodonho.designpattern.proxy;

public class Database {
	public static Bbs readBbs(int bbsno){
		Bbs bbs = new Bbs();
		// �����͸� ������ �Ŀ� �������ش�
		// ���� ...
		bbs.no = bbsno;
		bbs.title = "������111";
		bbs.content = "�����Դϴ�";
		return bbs;
	}
	
	public static void increaseVisit(int bbsno){
		// Visit �����ʹ� ���� Bbs �� ������ �����Ѵ�
	}

	public static BbsExtend readBbsExtend(int bbsno) {
		BbsExtend bbs = new BbsExtend();
		// �����͸� ������ �Ŀ� �������ش�
		// ���� ...
		bbs.no = bbsno;
		bbs.title = "������111";
		bbs.content = "�����Դϴ�";
		bbs.count = 3;
		return bbs;
	}
}
