import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Liste {
    public void writeIntegerList(List<Integer> myList){
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
    public void writeIStringList(List<String> myList){
        for (int i = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
    public List<Integer> insertInList(List<Integer> myList, int number){
        myList.add(myList.size(),number);
        return myList;
    }
    public void writeListFromNumber(List<Integer> myList, int number){
        for (int i = number; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
    public void writeListVersa(List<Integer> myList){
        for (int i = myList.size()-1; i>=0; i--){
            System.out.println(myList.get(i));
        }
    }
    public List<String> insertStringInList(List<String> myList, int position, String word){
        myList.add(position,word);
        return myList;
    }
    public List<Integer> insertToFirst (List<Integer> myList, int number){
        myList.add(0, number);
        return myList;
    }
    public void writeValuePosition(List<Integer> myList){
        for (int i=0; i<myList.size(); i++){
            System.out.println("Pe pozitia %s se afla valoarea %s".formatted(i,myList.get(i)));
            //La acest exercitiu am luat efectiv indexul, altfel se putea inlocui .formatted(i+1.myList.get(i).
        }
    }
    public int biggestInList (List<Integer> myList){
        Collections.sort(myList);
        return myList.get(myList.size()-1);
    }
    public List<Integer> changePositions (List<Integer> myList, int position1, int position2){
        myList.add(0, myList.get(position1));
        myList.set(position1+1, myList.get(position2+1));
        myList.set(position2+1, myList.get(0));
        myList.remove(0);
        return myList;
    }
    public List<Integer> evenList (List<Integer> myList){
        List<Integer> outList = new ArrayList<>();
        int pozout = 0;
        for (int i = 0; i<myList.size(); i++){
            if (myList.get(i) % 2 == 0) {
                outList.add(pozout,myList.get(i));
                pozout++;
            }
        }
        return outList;
    }
    public List<Integer> sortList (List<Integer> myList) {
        int nri = 0;
        int nrj = 0;
        for (int i = 0; i < myList.size(); i++) {
            for (int j = i + 1; j < myList.size(); j++) {
                nri = myList.get(i);
                nrj = myList.get(j);
                if (nri > nrj) {
                    myList.set(i, nrj);
                    myList.set(j, nri);
                }
            }

        }
        return myList;
    }
}
