import java.util.Arrays;
public class Twosum {
   public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        int[] sortedNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(sortedNums);

        int left = 0;
        int right = nums.length - 1;
     while (left < right) {
            int currentSum = sortedNums[left] + sortedNums[right];
            if (currentSum == target) {
                int leftIndex = -1;
                int rightIndex = -1;
                for (int i = 0; i < nums.length; i++) {
                    if (nums[i] == sortedNums[left] && leftIndex == -1) {
                        leftIndex = i;
                    } else if (nums[i] == sortedNums[right]) {
                        rightIndex = i;
                    }
                }
                result[0] = leftIndex;
                result[1] = rightIndex;
                break;
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        return result;
    }
        public static void main(String[] args) {
        int[] nums = {9, 1, 4, 5, 77};
        int target = 81;
        int[] result = twoSum(nums, target);

        if (result[0] != -1 && result[1] != -1) {
            System.out.println("Indices of the two numbers that add up to the target: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No solution found!");
        }
    }
}