

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
        LogicalOp op= new LogicalOp();
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
        op.For9(stele); //Pentru acest exercitiu am folosit o variabila care sa arate nr. dorit de * de la care sa inceapa in loc de nr. fix de 7 cerut in cerinta.

        //Tema - while loops.
        op.While1(n);
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
        op.While9(Fibonacci); //Pentru exercitiul asta am facut in asa fel incat sa se afiseze primele n nr. din sirul lui Fibonacci, nu doar primele 20.
        System.out.println();
        op.CozaWozaLoza();
        }
        }


