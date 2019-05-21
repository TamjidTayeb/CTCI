import java.util.Arrays;

public class reverseIntArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(solution(arr)));
    }

    static int[] solution(int[] nums) {
        int start =0;
        int end = nums.length-1;
        int temp;

        while (start<end) {
            temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
        return nums;
    }
}
