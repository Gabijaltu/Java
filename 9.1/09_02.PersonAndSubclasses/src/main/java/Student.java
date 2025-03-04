public class Student extends Person {

    private int credits = 0;

    public Student(String name, String address){
        super(name, address);
    }

    public void study() {
        credits++;
    }

    public int credits() {
        return credits;
    }

    @Override

    public String toString(){
        return this.getName() + "\n  " + this.getAddress() + "\n  Study credits " + credits + "\n";
    }
}
