package poly.ex4;

import poly.ex4.AbstractAnimal;
import poly.ex4.Cat;
import poly.ex4.Caw;
import poly.ex4.Dog;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(caw);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트");
        animal.sound();
        System.out.println("동물 소리 정료");
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트");
        animal.move();
        System.out.println("동물 이동 종료");
    }
}
