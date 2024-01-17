package poly.basic;

public class CastingMain6 {

    public static void main(String[] args) {

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);

        Parent parent2 = new Child();
        System.out.println("parent2 호출");
        call(parent2);

    }

    private static void call(Parent parent) {
        parent.parentMethod();
        // Child 인스턴스인 경우 childMethod() 실행
        // Child child 변수 선언이 가능하다 !
        // 덕분에 인스턴스가 맞는 경우 직접 다운 캐스팅하는 코드를 다 생략 할 수 있음
        if (parent instanceof Child child) {
            System.out.println("Child 인스턴스가 맞음");
            child.childMethod();
        }
    }
}
