package access.ex;

public class MaxCounter {
    private int count; //: 내부에서 사용하는 숫자 입니다. 초기값은 0입니다.
    private int max;    //: 최대값 입니다. 생성자를 통해 입력합니다.

    public MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max) {
            System.out.println("최대값을 초과할 수 없습니다.");
            return;
        }

        count += 1;
    }

    public int getCount() {
        return count;
    }

}
