public class Cat extends Animal implements NoiseCapable {


    private String name;

    public Cat(){
        this.name = "Cat";
    }

    public Cat(String name){
        super(name);
    }

    public void purr(){
        System.out.println(" purrs");
    }

    @Override
    public void makeNoise() {
        purr();
    }
}
