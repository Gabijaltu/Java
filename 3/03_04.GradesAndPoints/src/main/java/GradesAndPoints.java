
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points [0-100]:");
        int givenGrade = Integer.parseInt(scan.nextLine());
        if (givenGrade < 0) {
            System.out.println("Grade: impossible!");
        } else if (givenGrade > 100) {
            System.out.println("Grade: incredible!");
        } else if (givenGrade > -1 && givenGrade < 50) {
            System.out.println("Grade: failed");
        } else if (givenGrade > 49 && givenGrade < 60) {
            System.out.println("Grade: 1");
        } else if (givenGrade > 59 && givenGrade < 70) {
            System.out.println("Grade: 2");
        } else if (givenGrade > 69 && givenGrade < 80) {
            System.out.println("Grade: 3");
        } else if (givenGrade > 79 && givenGrade < 90) {
            System.out.println("Grade: 4");
        } else {
            System.out.println("Grade: 5");
        }
    }
}
