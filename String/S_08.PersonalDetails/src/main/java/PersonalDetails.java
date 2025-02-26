import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nameLength = 0;
        String name = "";
        int sumOfBY = 0;
        int count = 0;
        double averageOfBY = 0;

        while (true) {
            String nameAndBY = scanner.nextLine();

            if (nameAndBY.isEmpty()) {
                break;
            }

            String[] nameBY = nameAndBY.split(",");
            int birthYear = Integer.valueOf(nameBY[1]);

            if (nameBY[0].length() > nameLength) {
                name = nameBY[0];
                nameLength = nameBY[0].length();
            }

            sumOfBY += birthYear;
            count++;
        }

        if (count > 0) {
            averageOfBY = (double) sumOfBY / count;
        }

        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + averageOfBY);
    }
}
