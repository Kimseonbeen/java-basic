package extends1.overriding;

public class ElectricCar extends Car {

    /**
     * @Override는 부모의 기능을 override 한거다 라는 표식을 남기는것
     * 그래서 메서드 명이 부모 메서드 명과 같지 않으면 컴파일 오류가 발생
     * 혹시라도 모를 실수를 방지해준다.
     * - static, final, private 키워드가 붙은 메서드는 오버라이딩이 될 수 없다.
     *
     * - static : 클래스 레벌에서 작동하므로 인스턴스 레벨에서사용하는 오버라이딩이 의미가 없다.
     * 쉽게 이야기해서 그냥 클래스 이름을 통해 필요한 곳에 직접 접근하면 된다.
     * - final : 메서드 재정의를 금지한다.
     * - private : 메서드는 해당 클래스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다.
     * 따라서 오바라이딩 할 수 없다.
     *
     */
    @Override
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
