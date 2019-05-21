import java.util.HashSet;

public class jewelsInStones {
    public static void main(String[] args) {
        String st = "aAAbbbb";
        String j = "aA";
        System.out.println(solution(j,st));
    }

    static int solution(String J, String S) {
        char[] j = J.toCharArray();
        char[] s = S.toCharArray();

        int count = 0;

        HashSet<Character> set = new HashSet<>();

        for (char c : j) {
            set.add(c);
        }

        for (char c : s) {
            if (set.contains(c)) count++;
        }
        return count;
    }
}
