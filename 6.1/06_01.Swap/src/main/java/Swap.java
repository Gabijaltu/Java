
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        array[0] = 1;
        array[1] = 3;
        array[2] = 5;
        array[3] = 7;
        array[4] = 9;

        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
        System.out.println("");

        Scanner scan = new Scanner(System.in);
        System.out.println("Give two indices to swap:");

        int firstIndice = Integer.parseInt(scan.nextLine());
        int secondIndice = Integer.parseInt(scan.nextLine());

        int temp = array[firstIndice];
        array[firstIndice] = array[secondIndice];
        array[secondIndice] = temp;
        System.out.println("");

        // Instead of a while loop, a for loop
        // is used here, which is more preferable
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
