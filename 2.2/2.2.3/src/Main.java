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
        double distanceBetweenTwoPoints = Math.sqrt(Math.pow(secondPointX - firstPointX,2) + Math.pow(secondPointY - firstPointY,2));
        System.out.println("The distance between the two points is " + distanceBetweenTwoPoints);
    }
}