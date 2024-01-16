package final1;

public class ConstructInit {

    
    // final 필드에서 사용 시 생성자를 통해서 한번만 초기화 가능
    final int value;

    public ConstructInit(int value) {
        this.value = value;
    }

}
