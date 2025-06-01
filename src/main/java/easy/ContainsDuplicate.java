package easy;

import java.util.HashMap;
import java.util.Map;

//#217
public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int a = 0; a < nums.length; a++) {
            if (map.containsKey(nums[a])) {
                return true;
            }
            map.put(nums[a], a);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,1};
        int[] nums2 = new int[]{1,2,3,4};
        int[] nums3 = new int[]{1,1,1,3,3,4,3,2,4,2};

        System.out.println(containsDuplicate(nums1));
        System.out.println(containsDuplicate(nums2));
        System.out.println(containsDuplicate(nums3));
    }
}
