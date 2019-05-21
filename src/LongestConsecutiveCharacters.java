public class LongestConsecutiveCharacters {
    public static void main(String[] args) {
        System.out.println(solution("AAAAABACDADABBBAEA"));
    }

    static char solution(String s) {
        Character prev=null;
        int count=0;
        int maxCount = -1;
        char maxChar = ' ';
        for (char c : s.toCharArray()) {
            if (prev != null && c == prev) count++;
            else count=1;
            if (count>maxCount) {
                maxCount=count;
                maxChar=c;
            }
            prev = c;
        }
        return maxChar;
    }
}
