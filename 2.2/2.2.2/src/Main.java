import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of minutes:");

        int minutes = Integer.parseInt(scan.nextLine());
        int days = (minutes / 1440) % 365;
        int years = (minutes / 1440) / 365;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");

    }
}