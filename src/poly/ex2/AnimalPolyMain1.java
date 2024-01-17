package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Duck duck = new Duck();
        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(duck);


    }

    /**
     * animal 변수의 타입은 Animal 이므로 Dog 인스턴스에 있는 Animal 클래스 부분을 찾아서 sound() 메서드를 실행한다.
     * 그런데 하위 클래스인 Dog 에서 sound() 메서드를 오버라이딩 했다.
     * 따라서 오버라이딩한 메서드가 우선권을 가진다.
     * Dog 클래스에 있는 sound() 메서드가 호출되므로 "멍멍"이 출력된다.
     * @param animal
     */
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
