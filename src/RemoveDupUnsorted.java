public class RemoveDupUnsorted {
    static int solution(int[] nums) {
        int pointer = 1;

        for (int i=0; i<nums.length-1; i++) {
            if (nums[i]!=nums[i+1]) {
                nums[pointer]=nums[i+1];
                pointer++;
            }
        }
        return pointer;
    }
}
