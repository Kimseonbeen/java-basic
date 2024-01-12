package static1;

public class Data3 {

    /**
     * 기존 코드를 유지하기 위해서 새로운 클래서 Data3를 만들었다.
     * static int count 부분을 보자. 변수 타입(int) 앞에 static 키워드가 붙어있다.
     * 이렇게 멤버 변수에 static을 붙이게 되면, static 변수, 정적 변수 또는 클래스 변수라 한다.
     * 객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킨다.
     */

    public String name;

    /**
     * static 변수는 쉽게 이야기해서 클래스인 붕어빵 틀이 특별하게 관리하는 변수이다.
     * 붕어빵 틀은 1개이므로 클래스 변수도 하나만 존재한다.
     * 바면에 인스턴스인 붕어빵은 인스턴스의 수 만큼 변수가 존재한다.
     */
    public static int count;    //static

    public Data3(String name) {
        this.name = name;
        count++;
        // Data3.count++; -> 가능
    }
}
