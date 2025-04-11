import java.util.*;

public class skipcharacter {
    public static void main(String[] args) {
        char c = 'a';
        String str = "abacrveracga";
        System.out.println(skip(str, c));
        System.out.println(skipString("strappledgthapple", "apple"));
    }

    public static String skip(String str, char c) {
        if (str.length() == 0) {
            return "";
        }
        char ch = str.charAt(0);
        String s = str.substring(1);

        if (ch == c) {
            return skip(s, c);

        } else {
            return ch + skip(s, c);
        }

    }

    public static String skipString(String str, String skip) {
        if (str.length() == 0) {
            return "";
        }
        if (str.startsWith(skip)) {
            // return str.substring(skip.length());
            return skipString(str.substring(skip.length()), skip);
        } else {
            return str.charAt(0) + skipString(str.substring(1), skip);
        }
    }
}
