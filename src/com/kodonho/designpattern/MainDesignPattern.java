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
		
		// 1. �̱��� ���� ����� ����
		Singleton single1 = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.printf("single1.name=%s single2.name=%s \n", single1.name, single2.name);
		single1.name="ȫ�浿";
		System.out.printf("single1.name=%s single2.name=%s \n", single1.name, single2.name);
		
		// 2. ��Ƽ�� ���� ����� ����
		Multiton multi1 = Multiton.newInstance();
		Multiton multi2 = Multiton.newInstance();
		
		System.out.printf("multi1.name=%s multi2.name=%s \n", multi1.name, multi2.name);
		multi1.name="�̼���";
		System.out.printf("multi1.name=%s multi2.name=%s \n", multi1.name, multi2.name);
		
		// 3. ���Ͻ� ������ ����غ��ϴ�.
		Proxy proxy = Proxy.getInstance();
		Bbs bbs = proxy.getBbs(33); // ���Ƿ� �Խ��� ��ȣ�� �Ѱ��ش�
		System.out.printf("no=%d title=%s content=%s \n", bbs.no, bbs.title, bbs.content);
		
		// 4. ���ø� �޼��� ������ ����մϴ�.
		TemplateMethod frog = new Frog();
		frog.play();
		
		TemplateMethod rabbit = new Rabbit();
		rabbit.play();
		
		// 5. ���丮 �޼��� ������ ����մϴ�.
		FactoryMethod factory = new TVFactory();
		Product product = factory.make();
		Packed packed = factory.pack(product);
		
		// 6. ���������� ����մϴ�. Main�� Ŭ���̾�Ʈ
		Strategy strategy = null;
		Soldier context = new Soldier();

		// Ŭ���̾�Ʈ�� ���������� ���� ���¸� �����մϴ�.
		context.status = Soldier.NEAR;
		
		//���������� �����������̽��� ������ ����ü�� �����Ѵ�.
		if(context.status == Soldier.ATTACKED){
			strategy = new StrategySheild();
		} else if (context.status == Soldier.NEAR){
			strategy = new StrategySword();
		} else {
			strategy = new StrategyGun();
		}
		
		// ������ ���ؽ�Ʈ�� �Ѱܼ� ����Ѵ�
		context.useStrategy(strategy);
		
		// 7. ���� CallBack ������ ����մϴ�.
		// �������ϰ� �����ѵ� ������ü�� Ŭ���̾�Ʈ���� �͸�ü�� �����Ѵ�.
		Strategy strategy2 = null;
		Soldier context2 = new Soldier();
		
		context2.status = Soldier.ATTACKED;
		
		// ���� CallBack�� ����ü�� ������� �ʰ� �͸�ü�� �ڵ�󿡼� �������ش�.
		if(context2.status == Soldier.ATTACKED){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					useSheild();
					System.out.println("���´�~");
				}
				private void useSheild(){
					System.out.println("���и� ������� ���");
				}
			});
		} else if (context2.status == Soldier.NEAR){
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("���~ ");
				}
			});
		} else {
			context2.useStrategy(new Strategy(){
				@Override
				public void runStrategy() {
					System.out.println("���~ ");
				}
			});
		}
	}

}









