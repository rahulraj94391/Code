import java.util.*;

class Bike1 {
    public static void main(String args[]) {
        ArrayList<String> arrlst = new ArrayList<>();
        arrlst.add("Biscuit");
        arrlst.add("Snack");
        arrlst.add("Fruit");
        
        print(arrlst);
        arrlst.add("Milk");
        print(arrlst);

        System.out.println(arrlst.size());

    }

    static void print(ArrayList<String> l){
        int i = 1;
        for (String st : l) {
            System.out.println(i++ + " " + st);
        }
    }    
}


