import java.util.*;

class Bike1 {
    public static void main(String args[]) {
        ArrayList<String> arrlst = new ArrayList<>();
        arrlst.add("Biscuit");
        arrlst.add("Snack");
        arrlst.add("Fruit");

        // 1.
        for(String st: arrlst){
            System.out.println(st);
        }

        // 2.
        arrlst.add("Milk");
        for(String st: arrlst){
            System.out.println(st);
        }

        // 3.
        System.out.println(arrlst.size());

    }
}
