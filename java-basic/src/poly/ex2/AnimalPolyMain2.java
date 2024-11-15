package poly.ex2;

public class AnimalPolyMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();
        Dock dock = new Dock();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dock);
    }

    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 사운드 시작");
        animal.sound();
        System.out.println("동물 소리 사운드 종료");
    }
}
