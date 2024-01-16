package extends1.ex2;

public class ElectricCar extends Car {

    // ElectricCar -> Car
    // 화살표라는건 내가 상대방은 안다.
    // 자식은 이 부모인 Car를 아는것이다.
    // 부모는 자식이 누군지 모름


    /**
     * 상속 관계의 객체를 생성하면 그 내부에는 부모와 자식이 모두 생성된다.
     * 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이떄 호출자의 타입을 통해 대상 타입을 찾는다.
     * 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.
     */
    public void charge() {
        System.out.println("충전합니다.");
    }
}
