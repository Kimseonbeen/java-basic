package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    MemberConstruct(String name, int age) {
        /**
         * 이떄 this()라는 기능을 사용하면 생성자 내부에서 자신의 생성자를 호출할 수 있다.
         * 참고로 this는 인스터늣 자신의 참조값을 가리킨다.
         * 그래서 자신의 생성자를 호출한다고 생각하면된다.
         * 이 코드는 첫번째 생성자 내부에서 구번쨰 생성자를 생성
         * 이부분을 잘 활용하면 지금과 같이 중복을 제거할 수 있다.
         * this() 규칙
         * 생성자 첫줄에만 작성이 가능하다.
         */
        this(name, age, 50); // 변경

        /*this.name = name;
        this.age = age;
        this.grade = 50;*/
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + ", age = " + age + ", grade= " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
