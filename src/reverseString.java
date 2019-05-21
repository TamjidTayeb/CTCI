public class reverseString {
    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};
        System.out.println(solution(arr));
    }

    static char[] solution(char[] s) {
        int start=0;
        int end = s.length-1;
        char temp;

        while (start < end) {
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
        return s;
    }
}
