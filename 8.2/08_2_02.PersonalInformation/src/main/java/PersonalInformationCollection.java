import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("First name: ");
            String firstName = scanner.nextLine();

            if (firstName.isEmpty()) {
                break;
            }

            System.out.print("Last name: ");
            String lastName = scanner.nextLine();

            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            PersonalInformation person = new PersonalInformation(firstName, lastName, identificationNumber);
            infoCollection.add(person);
        }
        System.out.println();
       for (PersonalInformation person : infoCollection){
           System.out.println(person.getFirstName() + " " + person.getLastName());
       }

    }
}
