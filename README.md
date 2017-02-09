# Design Pattern
설계패턴에 대해 이해합니다

## GOF Design Pattern
23가지의 디자인 패턴에 대해 이해합니다

## Creational (생성)
인스턴스 생성을 위한 패턴으로, 인스턴스를 생성하는 객체와 생성된 인스턴스사이의 연결(의존성)을 줄여준다

* Singleton
클래스의 인스턴스가 하나만 생성되도록 보장하며, 생성된 인스턴스를 공유할 수 있도록 만든 패턴

* Factory Method
인스턴스를 생성하는 인터페이스를 미리 정의하고, 인스턴스의 생성을 서브클래스에게 위임하는 패턴

* Abstract Factory
서로 관련성 있거나 독립적인 여러 인스턴스를 조립해서 결과 인스턴스를 만드는  패턴

* Prototype
생성할 인스턴스의 종류를 명세하는 데에 원형의 기본틀을 이용하고, 그 기본틀을 복사함으로써 새로운 인스턴스를 생성하는 패턴

* Builder
복잡한 인스턴스를 생성과 표현을 분리하여, 조합에 따라서 서로 다른 표현 결과를 만들 수 있게 하는 패턴

## Structural (구조)
클래스 및 객체들을 구성을 통해서 더 큰 구조로 만들 수 있게 해준다  

* Adapter
클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환하는 패턴

* Bridge
구현부에서 추상층을 분리하여, 각자 독립적으로 변형할 수 있게 하는 패턴

* Composite
인스턴스들의 관계를 트리 구조로 구성하여 부분-전체 계층을 표현하는 패턴, 사용자가 단일 인스턴스와 복합 인스턴스를 모두 동일하게 다룰수 있다

* Decorator
클래스에게 동적인 기능이나 임무를 추가하고 원본데이터를 가공하는 패턴

* Facade
복잡한 서브 시스템에 대해서 간단한 인터페이스(메뉴)를 제공하는 패턴

* Flyweight
유사한 인스턴스들 사이에 가능한 많은 데이터를 서로 공유하여 사용하도록 하여 메모리 사용량을 최소화하는 패턴

* Proxy
인스턴스 사이의 흐름제어 및 정보은닉을 하기 위해 대리 객체를 제공하는 패턴

## Behavioral (행동)
클래스와 객체들이 상호작용하는 방법 및 역할을 분담하는 방법을 정의한다

* Command
요청을 객체의 형태로 캡슐화하여 사용자가 보낸 요청을 나중에 이용할 수 있도록 매서드 이름, 매개변수 등 요청에 필요한 정보를 저장 또는 취소할 수 있게 하는 패턴

* Iterator
컨테이너(배열)의 반복에 있어서 일관된 인터페이스를 두어 순차적으로 접근할 수 있는 방법을 제공하는 패턴

* Mediator
한 집합에 속한 객체들의 상호작용을 캡슐화하는 객체를 정의하는 패턴

* Memento
객체의 상태값 저장을 통해 해당 객체가 이전 상태로 돌아갈 수 있도록 하는 패턴

* Observer
데이터를 바라보는 인스턴스들의 갱신을 자동으로 할 수 있게 하는 패턴

* Interpreter
약속된 규칙으로 정의된 언어를 해석하는 패턴

* State
상태를 일반적인 데이터 변수로 두지않고, 객체로 만들어 그 상태에 따른 행동을 변경할 수 있도록 하는 패턴

* Strategy
비슷한 객체들을 캡슐화하고, 교환이 가능하도록 만든 패턴

* Visitor
데이터(또는 객체)의 구조와 처리(기능)을 분리할 수있는 패턴. 구조 안을 돌아다니면서 작업

* Template Method
템플릿을 만들고, 템플릿의 구현을 서브클래스에 위임하는 패턴

* Chain of Responsibility
각종 요청에 대해서 그것을 처리할 수 있는 객체가 존재할 때가지 연속적으로 객체를 탐사하며 요청을 처리할 수 있는 객체를 찾아주는 패턴

## Additional
추가적인 디자인 패턴에 대해 이해합니다

* Multiton
싱글턴과는 반대되는 개념으로 요청시 항상 새로운 인스턴스를 생성하는 패턴

* Strategy Callback
전략패턴에서 전략객체를 class로 만들지 않고 익명객체로 직접 만들어서 주입하는 패턴