package easy;
//#1
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        for(int a = 0; a < nums.length; a++) {
            for(int b = a+1; b < nums.length; b++) {
                if (nums[b] + nums[a] == target) {
                    return new int[] {a, b};
                }
            }
        }
        return null;
    }

    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a = 0; a < nums.length; a++) {
            int comp = target - nums[a];
            if (map.containsKey(comp)) {
                return new int[] {map.get(comp), a};
            }
            map.put(nums[a], a);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] one = new int[] {2, 7, 11, 15};
        int[] two = new int[] {3, 2, 4};
        int[] three = new int[] {3, 3};

        System.out.println(Arrays.toString(twoSum(one, 9)));
        System.out.println(Arrays.toString(twoSum(two, 6)));
        System.out.println(Arrays.toString(twoSum(three, 6)));

        System.out.println(Arrays.toString(twoSum2(one, 9)));
        System.out.println(Arrays.toString(twoSum2(two, 6)));
        System.out.println(Arrays.toString(twoSum2(three, 6)));
    }
}
