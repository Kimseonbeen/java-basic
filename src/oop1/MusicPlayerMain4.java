package oop1;

public class MusicPlayerMain4 {

    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        /**
         * MusicPlayer를 사용하는 코드를 보자. MusicPlayer 객체를 생성하고 필요한 기능(메서드)을 호출하기만 하면된다.
         * 필요한 모든 것은 MusicPlayer 안에 들어있다.
         * - MusicPlayer를 사용하는 입장에서는 MusicPlayer의 데이터인 volume, isOn 같은 데이터는 전혀 사용하지 않는다.
         * - MusicPlayer를 사용하는 입장에서는 MusicPlayer 내부에 어떤 속성(데이터)가 있는지 전혀 몰라도 된다.
         * - MusicPlayer를 사용하는 입장에서는 단순하게 MusicPlayer가 제공하는 기능 중에 필요한 기능을 호출해서 사용하기만 하면된다.
         */

        //음악 플레이어 켜기
        player.on();
        //볼륨 증가
        player.volumeUp();
        //볼륨 증가
        player.volumeUp();
        //볼륨 감소
        player.volumeDown();
        //음악 플레이어 상태
        player.showStatus();
        //음악 플레이어 끄기
        player.off();
    }
}
