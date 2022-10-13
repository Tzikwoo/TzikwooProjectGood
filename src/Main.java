public class Main {
    public static void main(String[] args) {
        Print Tema1 = new Print();
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
        System.out.println("Rezultatul impartrii nr. " + b + " cu " + a + " este " + calc.divide(b, a));
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
        float ore= 3;
        float minute= 180;
        float secunde= 10800;
        conv.viteza(distanta, ore, minute, secunde);
    }



}
