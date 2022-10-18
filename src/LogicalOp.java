public class LogicalOp {
   public int checkBiggerNumber (int first, int second){
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
       }




