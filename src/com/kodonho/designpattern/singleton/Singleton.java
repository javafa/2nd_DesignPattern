package com.kodonho.designpattern.singleton;
/*
 * Singleton
 * 싱글턴 패턴은 자원을 공유하기 위한 목적으로 사용한다. 
 * Multi-Thread 환경에서는 아래 로직에 동기화를 추가해야 한다.
 */
public class Singleton {
	// 싱글턴 자신을 담아두는 변수공간
	private static Singleton instance = null;
	
	private Singleton(){  } // new 사용을 못하게 한다

	public static Singleton getInstance(){
		// 1. instance 변수에 값이 있는지를 체크하고 없으면 생성한다.
		//    생성자가 private이지만 동일class안에 있기 때문에 new를 할 수 있다.
		if(instance == null){
			instance = new Singleton();
		}
		// 2. instance 를 리턴한다
		return instance;
	}
	
	public String name="";
}







