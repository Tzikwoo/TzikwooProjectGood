public class Main {
    public static void main(String[] args) {
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
        float distanta= 35000;
        float ore= 1;
        float minute= 30;
        float secunde= 3600;
        conv.viteza(distanta, ore, minute, secunde);*/



        LogicalOp op = new LogicalOp();
        String textInput= "FastTrackI";
        op.checkText(textInput);
        int x=10;
        int y= 8;
        int z = 11;
        System.out.println("The bigger number between " + x + " and " + y + " is " + op.checkBiggerNumber(x,y));
        op.punct5(textInput, x);
        op.punct6(y);
        op.punct7(x);
        op.punct8(x);
        System.out.println("Is the number even? " + op.isNumberEven(x));
        System.out.println("Is the person eligible to vote? " + op.isEligibleToVote(y));
        System.out.println("Cel mai mare dintre cele 3 numere introduse este: " + op.punct11(x,y,z));


    }
}
