public class MaxContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        solution(arr);
    }

    static int solution(int[] nums) {
        int max = Integer.MIN_VALUE/2;
        int maxEnd = Integer.MIN_VALUE/2;
        for (int i =0; i<nums.length;i++) {
            maxEnd = Math.max(nums[i],maxEnd+nums[i]);
            max = Math.max(max,maxEnd);
        }
        System.out.println(max);
        return max;
    }
}
