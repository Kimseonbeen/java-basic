package static1;

public class DataCountMain2 {

    public static void main(String[] args) {
        /**
         * Data2 class 가 몇개 생성되었지 확인 하고싶어
         * Counter라는 class를 생성하여 개수를 구하였다.
         * Data2 class 개수를 구하려고 Counter라는 클래스를 사용함에 있어 불편함.
         * Data2 class 안에서 해결하고 싶음
         */
        Counter counter = new Counter();
        Data2 data1 = new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        Data2 data2 = new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        Data2 data3 = new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
