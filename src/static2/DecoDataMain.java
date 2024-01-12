package static2;

import static static2.DecoData.*;

public class DecoDataMain {

    public static void main(String[] args) {
        System.out.println("1. 정적호출");
        staticCall();


        staticCall();
        /**
         *  import static 사용하면 클래스명 적지 않아도 된다.
         */
        DecoData.staticCall();


        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        staticCall(data1);

        // 추가
        DecoData data3 = new DecoData();

        // 인스턴스를 통한 접근
        // 둘 다 가능함 이건 인스턴스에 들어가서 한번 쿠션 먹고 가는거
        staticCall();

        // 클래스를 통한 접근
        staticCall();


    }
}
