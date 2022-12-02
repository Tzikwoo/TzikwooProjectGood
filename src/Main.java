import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Tema 1
        /*Print Tema1 = new Print();
        Tema1.printMyName();
        Tema1.printAdunare(11, 38);
        Tema1.printImpartire(10, 3);
        Tema1.printOp1();
        Tema1.printOp2();
        Tema1.printOp3();
        Tema1.printOp4();
        Calculator calc= new Calculator();
        int a = 11;
        int b = 3;
        int c = 8;
        System.out.println("Rezultatul adunarii nr. " + a + " cu " + b + " este " + calc.sum(a, b));
        System.out.println("Rezultatul inmultirii nr. " + a + " cu " + b + " este " + calc.multiply(a, b));
        System.out.println("Rezultatul impartirii nr. " + b + " cu " + a + " este " + calc.divide(b, a));
        System.out.println("Rezultatul scaderii nr. " + a + " cu " + b + " este " + calc.dif(a,b));
        System.out.println("Media nr. " + a + ", " + b + " , " + c + " este " + calc.media(a, b, c) );
        System.out.println("Restul impartirii nr. " + a + " cu " + b + " este " + calc.modulo(a, b));
        Vizuale viz = new Vizuale();
        viz.vizual1();
        System.out.println();
        viz.vizual2();
        Conversii conv= new Conversii();
        System.out.println(a + " grade Fahrenheit sunt " + conv.temperatura(a) + " grade Celsius.");
        System.out.println(b + " inch reprezinta " + conv.inch(b) + " metri.");
        float distanta= 2500;
        float ore= 5;
        float minute= 56;
        float secunde= 23;
        conv.viteza(distanta, ore, minute, secunde);*/
        //Tema 2
        /* LogicalOp op = new LogicalOp();
        String textInput= "FastTrackI";
        op.checkText(textInput);
        int x = 1 ;
        int y= 1;
        int z = 1;
        System.out.println("The bigger number between " + x + " and " + y + " is " + op.checkBiggerNumber(x,y));
        op.punct5(textInput, x);
        op.punct6(y);
        op.punct7(x);
        op.punct8(x);
        System.out.println("Is the number even? " + op.isNumberEven(x));
        System.out.println("Is the person eligible to vote? " + op.isEligibleToVote(y));
        System.out.println("Cel mai mare dintre cele 3 numere introduse este: " + op.punct11(x,y,z));*/
        //Tema for - loops.
        /*LogicalOp op= new LogicalOp();
        int n= 91;
        int x= 13;
        int y= 20;
        int stele=8;
        System.out.println("Primul exercitiu: ");
        op.For1(n);
        System.out.println("Al doilea exercitiu: ");
        op.For2(n);
        System.out.println("Al treilea exercitiu: ");
        op.For3(x,y);
        System.out.println("Al patrulea exercitiu: ");
        op.For4(x,y);
        System.out.println("Al cincilea exercitiu: ");
        op.For5();
        System.out.println("Al saselea exercitiu: ");
        op.For6();
        System.out.println("Al saptelea exercitiu: ");
        System.out.println("Suma nr. de la %s la 100 este %s".formatted(n,op.For7(n)));
        System.out.println("Al optulea exercitiu: ");
        System.out.println("Media nr. de la %s la 100 este %s".formatted(n,op.For8(n)));
        System.out.println("Al noualea exercitiu: ");
        op.For9(stele); //Pentru acest exercitiu am folosit o variabila care sa arate nr. dorit de * de la care sa inceapa in loc de nr. fix de 7
        // cerut in cerinta.
 */
        //Tema - while loops.
        /* op.While1(n);
        op.While2(n);
        op.While3(x,y);
        op.While4(y,x);
        op.While5();
        op.While6();
        op.While7();
        int a = 10;
        int b = 21;
        System.out.println("Media nr. divizibile cu 7 din intervalul %s -> %s este %s".formatted(a,b,op.While8(a,b)));
        int Fibonacci = 22;
        op.While9(Fibonacci); //Pentru exercitiul asta am facut in asa fel incat sa se afiseze primele n nr. din sirul lui Fibonacci,
        // nu doar primele 20.
        System.out.println();
        op.CozaWozaLoza();
         */
        //Tema - polimorfism;
        /*Calculator calc= new Calculator();
        System.out.println("Adunari");
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(1,2,3, 4));
        System.out.println(calc.sum(1.5, 2.3, 3.6));
        System.out.println("Diferente");
        System.out.println(calc.dif(1,2));
        System.out.println(calc.dif(1,2,3));
        System.out.println(calc.dif(3.5,2.3,6.7));
        System.out.println("Inmultiri");
        System.out.println(calc.multiply(2,3));
        System.out.println(calc.multiply(2,3,4));
        System.out.println(calc.multiply(2.3,0.5,0.3));
        System.out.println("Impartiri");
        System.out.println(calc.divide(5,2));
        System.out.println(calc.divide(7, 3.5, 0.5));
        System.out.println("Medii");
        System.out.println(calc.media(3,4,6));
        System.out.println(calc.media(1.3, 2.7, 2.0, 0.4));
        System.out.println("Modulo");
        System.out.println(calc.modulo(2,5));
        System.out.println(calc.modulo(3.5, 0.8, 1.3));
        //Tema - array
        System.out.println("Arrays");
        LogicalOp op = new LogicalOp();
        op.buildArray();
        System.out.println();
        int[] sir = new int[50];
        sir = op.buildArrayEven(sir);
        op.printArray(sir);
        System.out.println();
        System.out.println("The array's average is " + op.averageArray(sir));
        String[] arrayString = {"Se", "Cauta", "cauta", "la", " cat", " cat ", "mai", "multe", " stringuri"};
        String variabila = " cat";
        System.out.println("Is the desired String in the array of Strings? " + op.checkString(arrayString,variabila));

        int nr = 4;
        if (op.checkNumber(sir, nr) == -1) {
            System.out.println("The desired number isn't in the specified array of numbers.");
        }
            else{
                System.out.println("The desired number is in the specified array of numbers at index %s".formatted(op.checkNumber(sir, nr)));
            }


            String[] arraylinii = new String[10];
            arraylinii = op.popularelinii(arraylinii);
            op.afisarelinii(arraylinii, 10); //Pentru acest exercitiu am facut in asa fel incat sa se afiseze nr. dorit de linii cu minusuri,
        // in loc de nr. specificat de 10.

        int[] inarray = {1,12,255,68,99,133,44,7,18,29,30,11,38};
        int wantedNr= 30;
        int[] outarray = new int[inarray.length - 1];
        outarray = op.removeNrFromArray(inarray, wantedNr);
        op.printArray(outarray);
        System.out.println();

        int secondsmallest = op.secondSmallest(inarray);
        System.out.print("Al doilea cel mai mic nr. din sirul ");
        op.printArray(inarray);
        System.out.println("este " + op.secondSmallest(inarray));
        //Pentru exercitiul de mai sus am incercat sa folosesc si metoda predefinita sort,
        // care imi ordoneza crescator sirul astfel ca a doua cea mai mica valoare din acest array va fi mereu pe pozitia array[1].
        Arrays.sort(inarray);
        System.out.println("Al doilea cel mai mic nr. din sir este %s ".formatted(inarray[1]));

        int[] fullArray ={1,3,7,9,10,11,38};
        int[] emptyArray = new int[7];
        emptyArray = op.copyArray(fullArray, emptyArray);
        op.printArray(emptyArray);
        */
        //Tema - liste;
        List<Integer> IntegerList = new ArrayList<>();
        IntegerList.add(11);
        IntegerList.add(38);
        IntegerList.add(30);
        IntegerList.add(7);
        Liste liste = new Liste();
        System.out.println("Primul exercitiu: ");
        liste.writeIntegerList(IntegerList);
        IntegerList = liste.insertInList(IntegerList, 19);
        System.out.println("Al doilea exercitiu: ");
        liste.writeIntegerList(IntegerList);
        System.out.println("Al treilea exercitiu: ");
        liste.writeListFromNumber(IntegerList, 2);
        System.out.println("Al patrulea exercitiu: ");
        liste.writeListVersa(IntegerList);
        List<String> StringList = new ArrayList<>();
        StringList.add("First");
        StringList.add("Secundo");
        StringList.add("Tresa");
        StringList = liste.insertStringInList(StringList, 1, "Alalalal");
        System.out.println("Al cincilea exercitiu: ");
        liste.writeIStringList(StringList);
        IntegerList = liste.insertToFirst(IntegerList, 0);
        System.out.println("Al saselea exercitiu: ");
        liste.writeIntegerList(IntegerList);
        System.out.println("Al saptelea exercitiu: ");
        liste.writeValuePosition(IntegerList);
        int biggest = liste.biggestInList(IntegerList);
        System.out.println("Al optulea exercitiu: ");
        System.out.println(biggest);
        //Try - Catch
        /*Read read = new Read();
        System.out.println("Valoarea introdusa este: " + read.getDouble());*/
        }
        }


