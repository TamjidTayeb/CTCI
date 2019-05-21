public class palindrome {
    public static void main(String[] args) {
        System.out.println(solution("A man, a plan, a canal: Panama"));
    }

    static boolean solution(String s) {
        s= s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start=0;
        int end=s.length()-1;
        char[] letters = s.toCharArray();

        while (start<end) {
            if (letters[start]!=letters[end]) return false;
            start++;
            end--;
        }
        return true;
    }
}
