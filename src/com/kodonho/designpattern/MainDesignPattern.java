package com.kodonho.designpattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

import com.kodonho.designpattern.factorymethod.FactoryMethod;
import com.kodonho.designpattern.factorymethod.Packed;
import com.kodonho.designpattern.factorymethod.Product;
import com.kodonho.designpattern.factorymethod.TVFactory;
import com.kodonho.designpattern.proxy.Bbs;
import com.kodonho.designpattern.proxy.Proxy;
import com.kodonho.designpattern.singleton.Multiton;
import com.kodonho.designpattern.singleton.Singleton;
import com.kodonho.designpattern.strategy.Soldier;
import com.kodonho.designpattern.strategy.Strategy;
import com.kodonho.designpattern.strategy.StrategyGun;
import com.kodonho.designpattern.strategy.StrategySheild;
import com.kodonho.designpattern.strategy.StrategySword;
import com.kodonho.designpattern.templatemethod.Frog;
import com.kodonho.designpattern.templatemethod.Rabbit;
import com.kodonho.designpattern.templatemethod.TemplateMethod;

public class MainDesignPattern {

	public static void main(String[] args) {
		
		// 1. 싱글턴 패턴 사용해 보기
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.printf("single1.name=%s single2.name=%s \n", single1.name, single2.name);
		single1.name="홍길동";
		System.out.printf("single1.name=%s single2.name=%s \n", single1.name, single2.name);
		
		// 2. 멀티턴 패턴 사용해 보기
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		
		System.out.printf("multi1.name=%s multi2.name=%s \n", multi1.name, multi2.name);
		multi1.name="이순신";
		System.out.printf("multi1.name=%s multi2.name=%s \n", multi1.name, multi2.name);
		
		// 3. 프록시 패턴을 사용해봅니다.
		Proxy proxy = Proxy.getInstance();
		Bbs bbs = proxy.getBbs(33); // 임의로 게시판 번호를 넘겨준다
		System.out.printf("no=%d title=%s content=%s \n", bbs.no, bbs.title, bbs.content);
		
		// 4. 템플릿 메서드 패턴을 사용합니다.
		TemplateMethod frog = new Frog();
		frog.play();
		
		TemplateMethod rabbit = new Rabbit();
		rabbit.play();
		
		// 5. 팩토리 메서드 패턴을 사용합니다.
		FactoryMethod factory = new TVFactory();
		Product product = factory.make();
		Packed packed = factory.pack(product);
		
		// 6. 전략패턴을 사용합니다. Main이 클라이언트
		Strategy strategy = null;
		Soldier context = new Soldier();

		// 클라이언트가 전략선택을 위해 상태를 변경합니다.
		context.status = Soldier.NEAR;
		
		//전략패턴은 전략인터페이스를 구현한 구현체를 주입한다.
		if(context.status == Soldier.ATTACKED){
			strategy = new StrategySheild();
		} else if (context.status == Soldier.NEAR){
			strategy = new StrategySword();
		} else {
			strategy = new StrategyGun();
		}
		
		// 전략을 컨텍스트에 넘겨서 사용한다
		context.useStrategy(strategy);
		
		// 7. 전략 CallBack 패턴을 사용합니다.
		// 전략패턴과 동일한데 전략자체를 클라이언트에서 익명객체로 생성한다.
		Strategy strategy2 = null;
		Soldier context2 = new Soldier();
		
		context2.status = Soldier.ATTACKED;
		
		// 전략 CallBack은 구현체를 사용하지 않고 익명객체를 코드상에서 구현해준다.
		if(context2.status == Soldier.ATTACKED){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					useSheild();
					System.out.println("막는다~");
				}
				private void useSheild(){
					System.out.println("방패를 양손으로 잡고");
				}
			});
		} else if (context2.status == Soldier.NEAR){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("찌른다~ ");
				}
			});
		} else {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("쏜다~ ");
				}
			});
		}
	}

}









