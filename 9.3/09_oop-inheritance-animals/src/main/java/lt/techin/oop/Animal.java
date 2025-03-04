package lt.techin.oop;

public class Animal {

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur){
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getColor(){
        return color;
    }

    public int getNumberOfPaws(){
        return numberOfPaws;
    }

    public boolean getHasFur(){
        return hasFur;
    }

    public void getDescription(){
        String fur = hasFur ? "has" : "no";

        if (numberOfPaws == 1){
            System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " paw and " + fur + " fur.");
        }
        System.out.println("This animal is mostly " + color + ". It has " + numberOfPaws + " paws and " + fur + " fur.");
    }

}
