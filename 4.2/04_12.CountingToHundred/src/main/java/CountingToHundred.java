
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startingNumber = Integer.parseInt(scanner.nextLine());

        while (startingNumber <101) {
            System.out.println(startingNumber);
            startingNumber++;
        }
    }
}
