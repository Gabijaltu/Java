package lt.techin.oop;

public class Main {

    public static void main(String[] args) {

        Bird bird = new Bird("blue", 2, false);

        bird.getDescription();

        Dog dog = new Dog("brown", 4, true);

        dog.getDescription();
    }
}
