package extends1.super2;

public class ClassC extends ClassB {
    
    public ClassC() {
        /**
         * 부모가 기본생성자가 없으면 내가 super()를 직접 정해줘야한다.
         * ClassB는 따로 생성자를 정의 하였기때문에 기본 생성자가 없음.
         */
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
