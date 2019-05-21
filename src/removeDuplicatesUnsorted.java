import java.util.Arrays;
import java.util.HashSet;

public class removeDuplicatesUnsorted {
    static void solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int pointer=0;

        for (int i:nums) {
            set.add(i);
        }
        Integer[] r = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(r));
    }

    public static void main(String[] args) {
        solution(new int[]{2,5,3,9,7,4,2});
    }
}
