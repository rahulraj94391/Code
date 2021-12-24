
public class Playground {
    public static void main(String[] args) {
        String s = "daabcbaabcbc", part = "abc";
        System.out.println(removeOccurrences(s, part));
    }

    public static String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            s = s.replace(part, "");
        }
        return s;
    }
}
