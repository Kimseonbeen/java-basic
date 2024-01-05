package ref;

public class MethodChange2 {

    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 : dataA.value = " + dataA.value);
        System.out.println("dataA = " + dataA);
        changeReference(dataA);
        System.out.println("메서드 호출 후 : dataA.value = " + dataA.value);

    }

    /***
     * 참조형의 메서드 호출
     * 자바에서는 메서드의 매겨변수는 항상 값에 의해 전달된다.
     * 그러나 이 값이 실제 값이나, 참조(메모리 주소) 값이냐에 따라 동작이 달라진다.
     */
    static void changeReference(Data dataX) {
        System.out.println("dataX = " + dataX);
        dataX.value = 20;
    }
}
