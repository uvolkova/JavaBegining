package SRC;

public class For {
    public static void main(String[] args) {
        for (int i = 100; i >= 1; i--) {
            boolean d = getDel(i);
            if (getDel(i))
                System.out.println(i);
        }
    }

    public static boolean getDel(int i) {
        return (i % 4 == 0);
    }
}
