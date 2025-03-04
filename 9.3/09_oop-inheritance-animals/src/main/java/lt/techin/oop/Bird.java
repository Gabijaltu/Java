package lt.techin.oop;

public class Bird extends Animal {

    public Bird(String color, int numberOfPaws, boolean hasFur){
        super("blue", 2, false);
    }

    @Override

    public void getDescription(){
        String fur = getHasFur() ? "has" : "no";

        if (getNumberOfPaws() == 1){
            System.out.println("This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paw and " + fur + " fur. Moreover, it has 2 wings and can fly.");
        }
        System.out.println("This animal is mostly " + getColor() + ". It has " + getNumberOfPaws() + " paws and " + fur + " fur. Moreover, it has 2 wings and can fly.");
    }
}
