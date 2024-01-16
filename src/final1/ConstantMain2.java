package final1;

public class ConstantMain2 {

    public static void main(String[] args) {
        // 숫자만 써놓는걸
        // magic number라고 함
        // 유지보수를 하러던 다른 개발자는 숫자를 보고 벙찌게 된다.
        // 그래서 값이 고정되어 있는 값은 상수로 만들어서 확인 할 수 있도록
        System.out.println("프로그램 최대 참여자 수 : " + Constant.MAX_USERS);
        int currentUserCount = 999;
        process(currentUserCount++);
        process(currentUserCount++);
        process(currentUserCount++);

    }

    private static void process(int currentUserCount) {
        System.out.println("참여자 수 : " + currentUserCount);
        if (currentUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
