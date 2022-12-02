import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Read {
    public double getDouble(){
        Scanner scan = new Scanner(System.in);
        double number = Double.MAX_VALUE;
        boolean repeat = true;
        while (repeat){
            try{
                System.out.print("Introduceti o valoare: ");
                number = scan.nextDouble();
                repeat = false;
            }
            catch (InputMismatchException except) {
                System.out.println("Valoarea introdusa " + scan.nextLine() + " nu este de tip real.\n"
                + "Incercati din nou.");
            }
            }
        return number;
        }
        public int getInt(){
        Scanner scan = new Scanner(System.in);
        int number = 0;
        boolean repeat = true;
        while (repeat){
            try{
                System.out.print("Introduceti o valoare: ");
                number = scan.nextInt();
                repeat = false;
            }
            catch (InputMismatchException except){
                System.out.println("Valoarea introdusa "+ scan.nextLine() + " nu este de tip intreg.\n"
                + "Inceracti din nou.");
            }
        }
        return number;
        }
    }
