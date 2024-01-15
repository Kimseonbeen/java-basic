package extends1.super2;

public class ClassB extends ClassA {
    /**
     * ClassB는 ClassA를 상속 받았다.
     * 상속을 받으면 생성자의 첫줄에 super(...)를 사용해서 부모 클래스의 생성자를 호출해야한다.
     * - 예외로 생성자 첫줄에 this(...)를 사용할 수는 있다. 하지만 super(...)는 자식의 생성자 안에서 언젠가는 반드시 호출해야 한다.
     * - 부모 클래스의 생성자가 기본 생성자(파라미터가 없는 생성자)인 경우에는 super()를 생략할 수 있다.
     * @param a
     */

    public ClassB(int a) {
        // super();    //기본 생성자 생략 가능, 기본적으로 상속 시 첫줄에 생성된다
        this(10, 20);
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();    //기본 생성자 생략 가능, 기본적으로 상속 시 첫줄에 생성된다
        System.out.println("ClassB 생성자 a= " + a + " b= " + b);
    }
}
