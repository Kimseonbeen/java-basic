package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        // 앞에 this 생략
        nameField = nameParameter;
    }
}
