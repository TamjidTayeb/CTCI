import java.util.HashMap;
import java.util.Map;

public class NotrepeatedElement {
    public static void main(String[] args) {

    }

    static int solution(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i: nums) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            } else map.put(i,1);
        }
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            if (entry.getValue()!=2) return entry.getKey();
        }
        return -1;
    }
}
