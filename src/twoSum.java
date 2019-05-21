import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.NoSuchElementException;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {2,2,4,7,5,3};
        System.out.println(Arrays.toString(solution(arr,4)));
    }

    public static int[] solution(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int compliment;

        for (int i = 0; i<nums.length; i++) {
            compliment=target-nums[i];
            if (map.containsKey(compliment)) {
                return new int[]{map.get(compliment),i};
            }
            map.put(nums[i],i);
        }
        throw new NoSuchElementException();
    }
}
