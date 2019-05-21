import java.util.ArrayList;
import java.util.Arrays;

public class WeekdayWraparound {
    public static void main(String[] args) {
        System.out.println(solution("Wed",12));
    }

    public static String solution(String s, int k) {
        ArrayList<String> list = new ArrayList<String>(
                Arrays.asList("Mon","Tue","Wed","Thu","Fri","Sat","Sun")
        );
        int index=list.indexOf(s);
        int newIndex = (index + k) % list.size();
        return list.get(newIndex);
    }

}

