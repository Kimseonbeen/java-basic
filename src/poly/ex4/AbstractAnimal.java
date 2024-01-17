package poly.ex4;



public abstract class AbstractAnimal {

    /**
     * 순수 추상 클래스
     * 실행 로직을 전혀 가지고 있지 않다
     * 단지 다형성을 위한 부모 타입으로써 껍데기 역할만 제공할 뿐이다.
     *
     * 특징
     * 1. 인스턴스 생성 X
     * 2. 상속시 자식은 모든 메서드를 오버라이딩 해야한다
     * 3. 주로 다형성을 위해 사용된다.
     */
    public abstract void sound();
    public abstract void move();

}
