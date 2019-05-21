import java.util.ArrayList;
import java.util.Arrays;

public class arraysumparity {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2};
        solution(arr);
    }

    static int solution(int[] nums) {
        Arrays.sort(nums);
        int total=0;
        for (int i =0; i<nums.length-1; i+=2) {
            total+=Math.min(nums[i],nums[i+1]);
        }
        System.out.println(total);
        return total;
    }
}
