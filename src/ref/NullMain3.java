package ref;

public class NullMain3 {

    public static void main(String[] args) {
        BigData bigData = new BigData();
        System.out.println("bigData.count = " + bigData.count);
        System.out.println("bigData.data = " + bigData.data);

        //NullPointerException
        /**
         * BigData 생성하면 BigData의 인스턴스가 생성된다.
         * 이때 BigData 인스턴스의 멤버 변수에 초기화가 일어나는데,
         * BigData의 data 멤버 변수는 참조형이므로 null로 초기화 된다.
         * count 멤버 변수는 숫자이므로 0으로 초기화된다.
         * bigData.data.value = null.value
         */
        System.out.println("bigData.data.value = " + bigData.data.value);
    }
}
