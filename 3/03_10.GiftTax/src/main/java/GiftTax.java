
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");

        int valueOfTheGift = Integer.parseInt(scan.nextLine());

        if (valueOfTheGift > 0 && valueOfTheGift < 5000) {
            System.out.println("No tax!");
        } else if (valueOfTheGift > 4999 && valueOfTheGift < 25000) {
            double taxCounted = 100 + (valueOfTheGift - 5000) * 0.08;
            System.out.println("Tax: " + taxCounted);
        } else if (valueOfTheGift > 24999 && valueOfTheGift < 55000) {
            double taxCounted = 1700 + (valueOfTheGift - 25000) * 0.1;
            System.out.println("Tax: " + taxCounted);
        } else if (valueOfTheGift > 54999 && valueOfTheGift < 200000) {
            double taxCounted = 4700 + (valueOfTheGift - 55000) * 0.12;
            System.out.println("Tax: " + taxCounted);
        } else if (valueOfTheGift > 199999 && valueOfTheGift < 1000000) {
            double taxCounted = 22100 + (valueOfTheGift - 200000) * 0.15;
            System.out.println("Tax: " + taxCounted);
        } else if (valueOfTheGift > 999999) {
            double taxCounted = 142100 + (valueOfTheGift - 1000000) * 0.17;
            System.out.println("Tax: " + taxCounted);
        } else {
            System.out.println("Enter correct value");
        }
    }
}
