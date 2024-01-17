package poly.diamond;

public class Child implements InterfaceA, InterfaceB {
    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    /**
     * methodCommon() 의 경우 양쪽 인터페이스에 다 있지만 같은 메서드이므로 구현은 하나만 하면된다 !
     * 메서드를 구현해 놓은게 아니므로 상관이 없음 !
     */
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
