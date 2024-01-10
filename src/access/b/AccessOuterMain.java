package access.b;

import access.a.AccessData;

public class AccessOuterMain {

    public static void main(String[] args) {
        AccessData data = new AccessData();

        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //다른 패키지 default 호출 불가
        //data.defaultField = 2;
        //data.defaultMethod();

        //private 호출 불가

        /**
         * 내부에서는 본인에 있는 모든 필드나 멤버 변수에 다 접근 가능
         * innerAccess method안에 있는 private 접근 가능하게된다.
         */
        data.innerAccess();


    }
}
