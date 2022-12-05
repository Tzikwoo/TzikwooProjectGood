import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ConsoleMain {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        LogicalOp op = new LogicalOp();
        Liste liste = new Liste();
        Read read = new Read();
        Scanner scan = new Scanner(System.in);
        Conversii conversii = new Conversii();
        LoginConsole login = new LoginConsole();
        boolean repeat = true;
        boolean oklogin = true;
        boolean incercari= true;
        int option;
        int tries = 0;
        int [] myArray;
        while (oklogin && incercari) {
            if (tries < 3) {
                System.out.println("Introduceti numele de utilizator: ");
                String username = login.readUsername();
                System.out.println("Introduceti parola: ");
                String password = login.readPassword();
                if (login.checkLogin(username, password)) {
                    oklogin = false;
                    while (repeat) {
                        try {
                            System.out.println("\nHello!\n" +
                                    "Choose an option:\n" +
                                    "1.Adunare\n" +
                                    "2.Scadere\n" +
                                    "3.Inmultire\n" +
                                    "4.Impartire\n" +
                                    "5.Media Numerelor\n" +
                                    "6.Conversie temperatura Fahrenheit -> Celsius\n" +
                                    "7.Conversie distanta inch -> metri\n" +
                                    "8.Afisare sir\n" +
                                    "9.Ordonare crescatoare sir\n" +
                                    "10.Media nr. din sir\n" +
                                    "0.Exit");
                            option = read.getInt();
                            if (option == 0) {
                                throw new ArithmeticException();
                            }
                            if (option >10) {
                                throw new Exceptii();
                            }
                            switch (option) {
                                case 1:
                                    System.out.println("Introduceti 2 nr. pentru a afla suma lor: ");
                                    System.out.println("Suma nr. este: " + calc.sum(scan.nextInt(), scan.nextInt()));
                                    break;
                                case 2:
                                    System.out.println("Introduceti 2 nr. pentru a afla diferenta lor: ");
                                    System.out.println("Diferenta nr. este: " + calc.dif(scan.nextInt(), scan.nextInt()));
                                    break;
                                case 3:
                                    System.out.println("Introduceti 2 nr. pentru a realiza produsul lor: ");
                                    System.out.println("Produsul nr. este: " + calc.multiply(scan.nextInt(), scan.nextInt()));
                                    break;
                                case 4:
                                    System.out.println("Introduceti 2 nr. pentru a realiza impartirea lor: ");
                                    System.out.println("Catul nr. este: " + calc.divide(scan.nextFloat(), scan.nextFloat()));
                                    break;
                                case 5:
                                    System.out.println("Introduceti 3 nr. pentru a calcula media lor: ");
                                    System.out.println("Media nr. este: " + calc.media(scan.nextFloat(), scan.nextFloat(), scan.nextFloat()));
                                    break;
                                case 6:
                                    System.out.println("Introduceti temperatura in grade Fahrenheit: ");
                                    System.out.println("Temperatura in grade Celsius este :" + conversii.temperatura(scan.nextFloat()));
                                    break;
                                case 7:
                                    System.out.println("Introduceti distanta in inch: ");
                                    System.out.println("Distanta in metri este: " + conversii.inch(scan.nextFloat()));
                                    break;
                                case 8:
                                    System.out.println("Introduceti lungimea dorita pentru sir: ");
                                    op.printArray(op.buildArrayFromKeyboard(scan.nextInt()));
                                    break;
                                case 9:
                                    System.out.println("Introduceti lungimea dorita pentru sir: ");
                                    myArray = op.buildArrayFromKeyboard(scan.nextInt());
                                    Arrays.sort(myArray);
                                    op.printArray(myArray);
                                    break;
                                case 10:
                                    System.out.println("Introduceti lungimea dorita pentru sir: ");
                                    myArray = op.buildArrayFromKeyboard(scan.nextInt());
                                    System.out.println("Media nr. din sir este: " + op.averageArray(myArray));
                                    break;
                            }
                        } catch (ArithmeticException e) {
                            System.out.println("You have exited the menu.");
                            repeat = false;
                        }
                        catch (Exceptii exc){
                            System.out.println("Please enter a number between 0-10.");
                        }
                    }

                } else {
                    System.out.println("Wrong username or password. Please try again.");
                    tries++;
                }

            }
            else {
                System.out.println("You have introduced a wrong user or password more than three times. Access denied.");
                incercari = false;
            }
        }
    }

    }
