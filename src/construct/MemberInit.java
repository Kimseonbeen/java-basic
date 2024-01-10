package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    void initMember(String name, int age, int grade) {
        // this : 자기 자신의 인스턴스를 본다.
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
