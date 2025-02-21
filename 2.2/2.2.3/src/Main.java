import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x1:");
        double firstPointX = Double.parseDouble(scan.nextLine());
        System.out.println("Enter y1:");
        double firstPointY = Double.parseDouble(scan.nextLine());
        System.out.println("Enter x2:");
        double secondPointX = Double.parseDouble(scan.nextLine());
        System.out.println("Enter y2:");
        double secondPointY = Double.parseDouble(scan.nextLine());
        double distanceBetweenTwoPoints = Math.sqrt((secondPointX - firstPointX) * (secondPointX - firstPointX) + (secondPointY - firstPointY) * (secondPointY - firstPointY));
        System.out.println("The distance between the two points is " + distanceBetweenTwoPoints);
    }
}