package poly.basic;

public class CastingMain5 {

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

        if (parent instanceof Child) {
            // Child c = new Parent() 가능 한지 확인
            // 오른쪽이 왼쪽을 담을 수 있냐 없냐 !
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
