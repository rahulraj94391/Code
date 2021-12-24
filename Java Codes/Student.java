import java.util.Scanner;

class Stu {
    int x;
    String S_name;
    float fl;
    double dl;

    Stu(float f) {
        this.fl = f;
    }
    Stu(double d) {
        this.dl = d;
    }
}

public class Student {
    public static void main(String [] args) {
        Stu s1 = new Stu(3.6f);
        System.out.println(s1.fl);
        System.out.println(s1.dl);
    }
}

