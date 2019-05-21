import java.util.Arrays;

public class reverseWordsInString {
    public static void main(String[] args) {
        String str = "the sky is blue";
        System.out.println(solution(str));
    }

    static String solution(String s) {
        String[] words = s.split(" ");
        System.out.println(Arrays.toString(words));
        int start=0;
        int end=words.length-1;
        String temp;

        while (start<end) {
            temp=words[start];
            words[start]=words[end];
            words[end]=temp;
            start++;
            end--;
        }
        return String.join(" ",words);
    }
}
