package static2;

public class DecoData {

    private int instanceValue;

    private static int staticValue;

    
    // static 클래스 소속
    public static void staticCall() {
        // instanceValue++; -> static은 static만 호출가능 인스턴스변수는 사용하지 못한다.
        // instanceMethod();   // 인스턴스 메서드 접근, compile error
        
        
        staticValue++;  //정적 변수 접근
        staticMethod(); // 정적 메서드 접근
        
    }

    /**
     * static 메서드에서 참조값을 넘겨주면 당연히
     * instance 접근이 가능하다.
     */

    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }

    public void instanceCall() {
        instanceValue++;    // 인스턴스 변수 접근
        instanceMethod();   // 인스턴스 메서드 접근

        staticValue++;  //정적 변수 접근
        // DecoData.staticValue++; // 클래스명이 생략되어있음
        staticMethod(); // 정적 메서드 접근
        
    }

    private void instanceMethod() {
        System.out.println("instanceValue= " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("statidValue= " + staticValue);
    }
}
