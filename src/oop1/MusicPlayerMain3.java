package oop1;

public class MusicPlayerMain3 {

    public static void main(String[] args) {

        MusicPlayerData data = new MusicPlayerData();

        // 음악 플레이어 켜기
        on(data);
        //볼륨 증가
        volumnUp(data);
        //볼륨 증가
        volumnUp(data);
        //볼륨 감소
        volumnDown(data);
        //음악 플레이어 상태
        showStatus(data);
        //음악 플레이어 끄기
        off(data);
    }

    /**
     * 모듈화
     * 쉽게 이야기해서 레고 블럭을 생각
     * 필요한 블럭을 가져다 꼽아서 사용할 수 있다
     * 여기서는 음악 플레이어의 기능이 필요하면 해당 기능을 메서드 호출 만으올 손쉽게 사용할 수 있다
     *
     * 지금 까지 클래스를 사용해서 관련된 데이터를 하나로 묶고, 또 메서드를 사용해서 각각의 기능을 모듈화 하였다.
     * 하지만, 여기까지 절차 지향 프로그래밍...
     * 우리가 작성한 코드의 한계는 바로 데이터와 기능이 분리되어 있다는 점
     * @param data
     */
    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    static void volumnUp(MusicPlayerData data) {
        data.volume++;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }

    static void volumnDown(MusicPlayerData data) {
        data.volume--;
        System.out.println("음악 플레이어 볼륨 = " + data.volume);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨 : " + data.volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }
    }
}
