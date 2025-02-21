

public class Division {

    public static void main(String[] args) {
        
       division(2,1);
    }

    // implement the method here
    public static void division (int numerator, int denominator) {
        float numeratorF = (float) numerator;
        float denominatorF = (float) denominator;
        float division = numeratorF / denominatorF;
        System.out.println(division);
    }
}
