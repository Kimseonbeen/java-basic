package poly.basic;

// 다운캐스팅을 자동으로 하지 않는 이유
public class CastingMain4 {

    public static void main(String[] args) {
        
        // 인스턴스는 child
        Parent parent1 = new Child();
        
        // parent1은 인스턴스는 child지만 타입은 Parent라서 오류 발생
        Child child1 = (Child) parent1;
        child1.childMethod();   // 문제 없음

        /**
         * 1. Parent parent2 = new Parent();
         * 먼저 new Parent()로 부모 타입 객체를 생성한다. 따라서 메모리 상에 자식 타입은 전해 존재하지 않는다.
         * 생성 결과를 parent2에 담아둔다. 이 경우 같은 타입이므로 여기서는 문제가 발생하지 않는다.
         *
         * 2. Child child2 = (Child) parent2;
         * 다음으로 parent2를 Child 타입으로 다운캐스팅한다. 그런데 parent2는 Parent로 생성이 되었다.
         * 따라서 메모리 상에 Child 자체가 존재하지 않는다. Child 자체를 사용할 수 없는 것이다.
         * 자바에서는 이렇게 사용할 수 없는 타입으로 다운캐스팅하는 경우에 ClassCastException이라는 예외를 발생시킨다.
         */
        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; // 런타임 오류 - ClassCastException
        child2.childMethod();   // 실행 불가
    }
}
