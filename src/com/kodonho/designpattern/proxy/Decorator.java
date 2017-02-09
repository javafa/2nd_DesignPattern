package com.kodonho.designpattern.proxy;
/*
 * Decorator
 * Proxy와 비슷한 형태의 패턴이지만
 * 클라이언트 요청에 대한 원본데이터를 가공한 후 전달한다.
 */
public class Decorator {
	// 1. 나를 담을 변수를 선언
	private static Decorator instance;
	// 2. 생성을 금지
	private Decorator(){}
	// 3. instance를 체크해서 넘겨준다
	public static Decorator getInstance(){
		if(instance == null){
			instance = new Decorator();
		}
		return instance;
	}
	// 4. 대행함수 getBbs 구현
	public BbsExtend getBbs(int bbsno){
		BbsExtend bbs = Database.readBbsExtend(bbsno);
		// 원본 데이터를 가져와서 가공한 후 넘겨준다.
		bbs.count = bbs.count + 1;
		bbs.title = "제목:" + bbs.title;
		return bbs;
	}
	
}
