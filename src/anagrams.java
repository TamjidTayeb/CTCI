import java.util.Arrays;

public class anagrams {
    public static void main(String[] args) {

    }

    static boolean solution(String s, String t) {
        char[] sTemp = s.toCharArray();
        char[] tTemp = t.toCharArray();

        Arrays.sort(sTemp);
        Arrays.sort(tTemp);

        s = new String(sTemp);
        t = new String(tTemp);

        return s.equals(t);
    }
}
