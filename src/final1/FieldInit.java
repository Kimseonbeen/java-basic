package final1;

public class FieldInit {


    /**
     * 공용 변수 이지만, 바뀌지 않는 공용 변수
     * final만 사용 시 같은값을 가진 인스턴스가 중복 누적 되므로
     * static를 사용한다.
     */
    static final int CONST_VALUE = 10;
    final int value = 10;


    /**
     * 위에서 초기화 했기 떄문에
     * 생성자를 통해서 초기화 불가
     */
    /*public FieldInit(int value) {
        this.value = value;
    }*/
}
