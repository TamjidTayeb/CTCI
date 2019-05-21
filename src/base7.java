public class base7 {
    public static void main(String[] args) {
        System.out.println(solution("56"));
    }

    public static int solution(String num) {
        int from = Integer.parseInt(num);
        int power=0;
        int total=0;

        while (from>0) {
            total+= from % 7 * Math.pow(10,power);
            from /= 7;
            power++;
        }
        return total;
    }
}

//1024 / 7 take the remainder * 10^power add to total

//1024 % 7 * Math.pow(10,power)
