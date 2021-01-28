# core-spring
'스프링 핵심 원리 - 기본편' 인프런 강의를 기반으로 코드를 작성해보고, 공부한 내용을 정리하는 공간이다.

'기술을 공부하기 위해서는 해당 기술의 컨셉 즉 어떠한 문제를 어떠한 방법으로 해결하고자 했는지 알고 해당 기술을 접하면 이해하기가 수월하다.'

## SOLID 원칙
- SRP(Single responsibility principle) : 단일 책임 원칙
- OCP(Open/closed principle) : 개발-폐쇄 원칙
- LSP(Liskov substitution principle) : 리스코프 치환 원칙
- ISP(Interface segregation principle) : 인터페이스 분리 원칙
- DIP(Dependency inversion principle) : 의존관계 역전 원칙
### SRP(Single responsibility principle) : 단일 책임 원칙
- 한 클래스는 하나의 책임만 가져야 한다.
- 하나의 책임이라는 것은 모호하다
    - 클 수 있고, 작을 수 있다.
    - 문맥과 상황에 따라 다르다.
- 중요한 기준은 변경이다. 변경이 있을 때 파급 효과가 적으면 단일 책임 원칙을 잘 따른 것이다.
- ex) UI 변경, 객체 생성과 사용을 분리 등... 
### OCP(Open/closed principle) : 개방-폐쇄 원칙
- 소프트웨어 요소는 확장에는 열려 있으나 변경에는 닫혀 있어야 한다.
- 다형성이 그나마 OCP 원칙에 부합한다고 할 수 있다. 
- 인터페이스를 구현한 새로운 클래스를 하나 만들어서 새로운 기능을 구현할 경우 확장은 쉽게 할 수 있고, 변경은 최소화할 수 있다.
- 구현의 분리를 생각해보면 이해하기 수월하다.
- 다형성을 사용하더라도 OCP 원칙을 지킬 수는 없다.
- 객체를 생성하고, 연관관계를 맺어주는 별도의 조립, 설정자가 필요하다.
### LSP(Liskov substitution principle) : 리스코프 치환 원칙
- 프로그램의 객체는 프로그램의 정확성을 깨뜨리지 않으면서 하위 타입의 인스턴스로 바꿀 수 있어야 한다.
- 다형성에서 하위 클래스는 인터페이스 규약을 다 지켜야한다는 것, 다형성을 지원하기 위한 원칙, 인터페이스를 구현한 구현체는 믿고 사용하려면, 이 원칙이 필요하다.
- 즉,프로그램 상의 문제가 발생하지 않지만 각 프로젝트에서 협의된 개발규칙 같은 것이다.
### ISP(Interface segregation principle) : 인터페이스 분리 원칙
- 특정 클라이언트를 위한 인터페이스 여러 개가 범용 인터페이스 하나보다 낫다.
- 여러 개로 분리할 경우 인터페이스 자체가 변해도 클라이언트에 미치는 영향이 미미하다.
- 인터페이스가 명확해지고, 대체 가능성이 높아진다.
### DIP(Dependency inversion principle) : 의존관계 역전 원칙
- 프로그래머는 "추상화에 의존해야지, 구체화에 의존하면 안된다." 의족성 주입은 이 원칙을 따르는 방법 중 하나다.
- 즉, 구현 클래스에 의존하지 말고, 인터페이스에 의존하라는 뜻과 같다.
- 강의에서 중요하게 이야기한 역할(Role)에 의존하게 한다는 것과 일맥상통하다. 객체 세상도 클라이언트가 인터페이스에 의존해야 유연하게 구현체를 변경할 수 있다. 구현체에 의존하게 되면 변경이 매우 어려워진다.