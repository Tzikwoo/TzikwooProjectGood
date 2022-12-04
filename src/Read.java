import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Read {
    public double getDouble() {
        Scanner scan = new Scanner(System.in);
        double number = Double.MAX_VALUE;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Introduceti o valoare de tip real: ");
                number = scan.nextDouble();
                repeat = false;
            } catch (InputMismatchException except) {
                System.out.println("Valoarea introdusa " + scan.nextLine() + " nu este de tip real.\n"
                        + "Incercati din nou.");
            }
        }
        return number;
    }

    public int getInt() {
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.print("Introduceti o valoare de tip intreg: ");
                number = scan.nextInt();
                repeat = false;
            } catch (InputMismatchException except) {
                System.out.println("Valoarea introdusa " + scan.nextLine() + " nu este de tip intreg.\n"
                        + "Incercati din nou.");
            }
        }
        return number;
    }

    public int[] getArrayFromKeyboard(int length) {
        int[] outArray = new int[length];
        for (int i = 0; i < outArray.length; i++) {
            outArray[i] = getInt();
        }
        return outArray;
    }

    public List<Integer> getListFromKeyboard() {
        List<Integer> outList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean repeat = true;
        while (repeat) {
            try {
                System.out.println("Introduceti o valoare pentru lista: ");
                outList.add(scan.nextInt());
            } catch (InputMismatchException e) {
                if (scan.nextLine().equals("Exit")) {
                    repeat = false;
                }
            }
        }
        return outList;
    }
}