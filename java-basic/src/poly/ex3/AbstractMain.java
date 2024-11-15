package poly.ex3;

import poly.ex3.AbstractAnimal;

public class AbstractMain {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        cat.sound();
        cat.move();

        soundAnimal(cat);
        soundAnimal(dog);
        soundAnimal(caw);

    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("animal" + animal);
        System.out.println("동물 소리 테스트");
        animal.sound();
        System.out.println("동물 소리 정료");
    }
}
