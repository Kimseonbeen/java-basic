package access.a;

/**
 * pulbic class는 파일 당 1개만 가능
 * default class는 여러개 가능
 */
public class PublicClass {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }
}

// defalult 접근제어자
// 같은 패키지 내에서만 접근이 가능
class DefaultClass1 {

}

class DefaultClass2 {

}
