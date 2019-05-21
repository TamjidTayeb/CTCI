public class marks {
    public static void main(String[] args) {
        System.out.println(isNumeric("lolx"));

    }

    public static boolean isNumeric (String s) {
        boolean numeric = true;
        s = s.substring(s.length()-2, s.length()-1);
        System.out.println(s);
        try {
            Double num = Double.parseDouble(s);
        } catch (NumberFormatException e) {
            numeric = false;
        }
        return numeric;
    }
}
