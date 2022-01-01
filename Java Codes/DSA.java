public class DSA {
    public static void main(String[] args) {
        // System.out.println(isPowerOfThree(1));
        int i = 3;
        int e = 6;
        int x = 7;
        String s = "";
        if ((i + e) >= (i + x)) {
            i++;
            s = "gg";
            e--;
        } else if ((i + e + x) >= 15) {
            x++;
            s = "wp";
        }
        System.out.println(x + s);
    }

    public static boolean isPowerOfThree(int n) {
        for (int x = 0; x < 20; x++)
            if (Math.pow(3, x) == n)
                return true;
        return false;
    }
}
