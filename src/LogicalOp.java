import java.util.Arrays;

public class LogicalOp {
    /*public int checkBiggerNumber (int first, int second){
        if (first>second) {
            return first;
        }
            else{
                return second;
            }
        }
        public void checkText (String textInput){
         if (textInput.equals("FastTrackIT")){
             System.out.println("Learning text comparison");
             }
             else {
             System.out.println("Got to try some more");
         }
         }
         public void punct5 (String textInput, int nrInput){
        if (textInput.equals("FastTrackIT")&&(nrInput<=3)){
            System.out.println(textInput + " " + nrInput);}
            else if (!textInput.equals("FastTrackIT")&&(nrInput>=4)){
                System.out.println(nrInput + " " + textInput);
            }
            else {
            System.out.println("No conditions were met.");
        }
         }
         public void punct6 (int nrInput){
        if ((nrInput==6)||(nrInput>8)) {
            System.out.println("The amount of snow this winter was(cm): " + nrInput);
        }
        else {
            System.out.println("The forecast snow is(cm): " + nrInput);
        }
         }
         public void punct7 (int nrInput){
        if ((nrInput>3) && (nrInput!=4)){
            System.out.println("The number is greater than 3 and not equal to 4");
        } else if (nrInput==4){
            System.out.println("The number is equal to 4");
        } else if (nrInput<3){
                 System.out.println("The number is lower than 3");
        } else {
            System.out.println("No conditions were met");
        }
         }
         public void punct8(int nr){
        switch (nr){
            case 1:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 2:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 3:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 4:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 5:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 6:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 7:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 8:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            case 9:
                System.out.println("The number is: %s !".formatted(nr));
                break;
            default:
                System.out.println("The number isn't between 1-9.");
         }
    }
         public boolean isNumberEven (int nrInput){
        boolean result = false;
        if (nrInput%2==0){
            result = true;
        }
            return result;
        }
        public boolean isEligibleToVote(int varsta){
        boolean result = false;
        if (varsta>=18){
            result = true;
        }
        return result;
        }
        public int punct11(int nr1, int nr2, int nr3) {
            int result = 0;
            if (nr1 > nr2) {
                if (nr1 > nr3) {
                    result = nr1;
                } else {
                    result = nr3;
                }
            }
        else if (nr2 > nr3) {
                    result = nr2;
                } else {
                    result = nr3;
                }

        return result;
            }

     */
    //For loops.
    /*public void For1(int n) {
        int i;
        for (i = n; i <= 100; i++) {
            System.out.println(i);
        }
    }

    public void For2(int n) {
        int i;
        for (i = n; i >= -100; i--) {
            System.out.println(i);
        }

    }

    public void For3(int x, int y) {
        int i;
        for (i = x; i <= y; i++) {
            System.out.println(i);
        }
    }

    public void For4(int x, int y) {
        int i;
        if (x > y) {
            for (i = y; i <= x; i++) {
                System.out.println(i);
            }
        } else {
            for (i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
    }

    public void For5() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public void For6() {
        int i;
        for (i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public int For7(int n) {
        int i;
        int sum = 0;
        for (i = n; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    public float For8(int n) {
        int i;
        int sum = 0;
        int count = 0;
        for (i = n; i <= 100; i++) {
            sum += i;
            count++;
        }
        return (float) sum / count;
    }

    public void For9(int n) {
        int i;
        int j;
        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
*/
    //While loops.
    /*
    public void While1(int n) {
        while (n <= 100) {
            System.out.println(n);
            n++;
        }
    }

    public void While2(int n) {
        while (n >= -100) {
            System.out.println(n);
            n--;
        }
    }

    public void While3(int nr1, int nr2) {
        while (nr1 <= nr2) {
            System.out.println(nr1);
            nr1++;
        }
    }

    public void While4(int nr1, int nr2) {
        if (nr1 > nr2) {
            while (nr2 <= nr1) {
                System.out.println(nr2);
                nr2++;
            }
        } else {
            while (nr1 <= nr2) {
                System.out.println(nr1);
                nr1++;
            }
        }
    }

    public void While5() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void While6() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void While7() {
        int nr1 = 111;
        int sum = 0;
        int count = 0;
        while (nr1 <= 8899) {
            sum += nr1;
            count++;
            nr1++;
        }
        System.out.println("Suma nr. din intervalul 111 -> 8899 este %s".formatted(sum));
        System.out.println("Media nr. din intervalul 111 -> 8899 este %s".formatted((float) sum / count));
    }

    public float While8(int nr1, int nr2) {
        int sum = 0;
        int count = 0;
        while (nr1 <= nr2) {
            if (nr1 % 7 == 0) {
                sum += nr1;
                count++;
            }
            nr1++;
        }
        return (float) sum / count;
    }

    public void While9(int n) {
        int a = 0;
        int b = 1;
        int i = 3;
        int c = -0;
        System.out.print(a + " ");
        System.out.print(b + " ");
        while (i <= n) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }

    public void CozaWozaLoza() {
        int i = 1;
        while (i<=110){
            if (i % 3 == 0 && i % 5== 0 && i % 7== 0){
                System.out.print("CozaLozaWoza ");
            }
            else if (i % 5 == 0 && i % 7 == 0){
                System.out.print("WozaLoza ");
            }
            else if (i % 3 == 0 && i % 5 == 0){
                System.out.print("CozaLoza ");
            }
            else if (i % 3==0 && i % 7==0) {
                System.out.print("CozaWoza ");
            }
            else if (i % 3 == 0){
                System.out.print("Coza ");
            }
            else if (i % 5== 0){
                System.out.print("Loza ");
            }
            else if (i % 7== 0){
                System.out.print("Woza ");
            }
            else{
                System.out.print("%s ".formatted(i));
            }
            if (i % 11 == 0){
                System.out.println();
            }
            i++;
        }
*/
    //Arrays
    public void buildArray(){
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++){
            array[i] = i+1;
            System.out.print(array[i] + " ");
        }
    }
    public int[] buildArrayEven(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i*2 + 2;
        }
        return array;
    }
        public void printArray(int[] array){
        for (int i = 0; i< array.length; i++){
            System.out.print(array[i] + " ");
        }
        }
        public float averageArray(int[] array){
        float sum = 0;
        for (int i = 0; i< array.length; i++){
            sum += array[i];
        }
        return sum/array.length;
        }
        public boolean checkString(String[] array, String value){
        for (int i = 0; i< array.length; i++){
            if (array[i].equals(value)){
                return true;
            }
        }
        return false;
        }
        public int checkNumber(int[] array, int value){
        for (int i=0; i< array.length; i++){
            if (array[i] == value){
                return i;
            }
        }
        return -1;
        }
        public String[] popularelinii(String[] array){
        for (int i = 0; i< array.length; i++){
            array[i]="-";
        }
        return array;
        }
        public void afisarelinii(String[] array, int nrlinii){
        for (int i = 1; i<= nrlinii; i++){
            for (int j = 0; j<array.length; j++ ){
                System.out.print(array[j] + " ");
            }
            System.out.println();
        }
        }
        public int[] removeNrFromArray (int[] inarray, int nr){
        int[] outarray = new int[inarray.length-1];
        int l = 0;
        for (int i = 0; i< inarray.length; i++) {
            if (inarray[i]!= nr){
                outarray[l] = inarray[i];
                l++;
            }
        }
        return outarray;
        }
        public int secondSmallest (int[] array){
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i< array.length; i++){
            if (array[i]<smallest){
                secondsmallest = smallest;
                smallest = array[i];
            }
            if (array[i]<secondsmallest && array[i] !=smallest){
                secondsmallest = array[i];
            }
            }
        return secondsmallest;
        }
        public int[] copyArray(int[] inarray, int[] outarray){
        for (int i= 0; i<inarray.length; i++){
            outarray[i] = inarray[i];
        }
        return outarray;
        }
    public void writeValueFromPosition(int[] myArray, int position) {
        try {
            System.out.println("Valoarea din sir de pe pozitia " + position + " este: " + myArray[position]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large.");
        }
    }
    public void wait(int numberOfSeconds){
        try {
            Thread.sleep(numberOfSeconds * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    }










