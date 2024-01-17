package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {

        /**
         * 1. 문제 : Animal 클래스를 생성할 수 있는 문제
         * Why? 문제
         * Animal 클래스는 동물이라는 클래스이다.
         * 이 클래스를 직접 생성해서 사용할 일이 있을까 ???
         * 동물이라는 객체가 있나 ????? 조금 어색하다..
         * 개, 고양이, 소가 실제 존재하는 것은 당연하지만, 동물이라는 추상적인 개념이 실제로 존재하는 것은 이상하다.
         */
        Animal a = new Animal();
        a.sound();

        // ctrl + alt + n : inline variable
        /**
         * 2. 문제 : Animal 클래스를 상속 받는 곳에서 sound() 메서드 오버라이딩을 하지 않을 가능성
         * Pig에 메서드 오버라이딩을 깜박 !
         * 이렇게 되면 부모 기능 상속 !
         * 따라서 코드상 문제 X
         * 물론 프로그램 실행시 "꿀꿀"이 아니라 부모 클래스에었는 Animal.sound()가 호출 !
         */

        /** 문제 해결 !
         *  좋은 프로그램은 제약이 있는 프로그램
         *  추상 클래스와 추상 메서드를 사용하면 문제 한번에 해결 !
         */
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }


}
