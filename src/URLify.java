import java.util.Arrays;

public class URLify {
    static void solution(char[] s,int length) {
        int spaces=0;
        for (int i = 0; i<length;i++) if (s[i]==' ') spaces++;

        int right = length+spaces*2-1;

        for (int i=length-1; i>=0; i--) {
            if(s[i]==' ') {
                s[right]='0';
                right--;
                s[right]='2';
                right--;
                s[right]='%';
                right--;
            } else {
                s[right]=s[i];
                right--;
            }
        }
        System.out.println(Arrays.toString(s));
    }

    public static void main(String[] args) {
        solution(new char[]{'M','R',' ','J','O','H','N',' ','S','M','I','T','H',' ',' ',' ',' ',' ',' '},13);
    }
}
