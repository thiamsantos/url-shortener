package shortener;

public class Base62 {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";

    public static final int BASE = ALPHABET.length();

    public static String encode(int i) {
        StringBuilder sb = new StringBuilder("");
        if (i == 0) {
            return "a";
        }
        while (i > 0) {
            int rem = i % BASE;
            sb.append(ALPHABET.charAt(rem));
            i = i / BASE;
        }
        return sb.reverse().toString();
    }
}
