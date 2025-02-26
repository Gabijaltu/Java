
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {

            String text = String.valueOf(scanner.nextLine());
            String[] words = text.split(" ");

            System.out.println(words[words.length - 1]);

        }

    }
}
