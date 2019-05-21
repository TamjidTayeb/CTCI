public class nums {
    public static void main(String[] args) {
        System.out.println(solution(83643));
    }

    public static String solution(int i) {
        int h = i / 3600;
        int r = i - h * 3600;
        int m = r / 60;
        r = r - (m * 60);
        int secs = r;

        String s = Integer.toString(h)+"h"+Integer.toString(m)+"m"+Integer.toString(secs)+"s";
        return s;
    }
}
