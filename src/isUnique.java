import java.util.Arrays;
import java.util.HashSet;

public class isUnique {
    static boolean solution(String s) {
        HashSet<Character> set = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (set.contains(c)) return false;
            set.add(c);
        }
        return true;
    }

    static boolean firstSolution(String s) {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        s = new String(c);
        for (int i =0; i<s.length()-1; i++) {
            if (s.charAt(i)==s.charAt(i+1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "qwerty";
        System.out.println(firstSolution(test));
    }
}
