import java.util.Arrays;

public class ReverseInt {

    public static void main(String[] args) {
        System.out.println(reverse(-12356689));
    }
    public static int reverse(int num) {
        boolean isNeg=false;
        if (num<0) {
            isNeg = true;
            num=Math.abs(num);
        }
        char[] n = Integer.toString(num).toCharArray();
        int start =0;
        int end = n.length-1;
        char temp;

        while(start<end) {
            temp = n[start];
            n[start] = n[end];
            n[end] = temp;
            start++;
            end--;
        }
        num = Integer.parseInt(new String(n));
        System.out.println(num);
        if (isNeg) num*=(-1);
        return num;
    }
}
