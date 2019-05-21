import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

public class majorityelement {
    public static void main(String[] args) {
        int[] ar = {3,3,2};//{2,2,1,1,1,2,2};
        System.out.println(solution(ar));
    }

    static int solution(int[] nums) {
        int half = (int)Math.ceil((double)nums.length/2.0);
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i: nums) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
                if (map.get(i)==half) return i;
            }
            else map.put(i,1);
        }
        throw new NoSuchElementException();
    }
}
