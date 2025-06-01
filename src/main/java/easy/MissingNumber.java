package easy;
//#268

import java.util.Arrays;

public class MissingNumber {
    //O(nlogn)
    public static int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int ret = 0;
        for(; ret < nums.length; ret++) {
            if (nums[ret] != ret) {
                return ret;
            }
        }
        return ret;
    }

    //O(n)
    public static int missingNumber2(int[] nums) {
        int actualSum = 0;
        int totalSum = 0;
        for (int a = 0; a < nums.length; a++) {
            actualSum += nums[a];
            totalSum += a;
        }
        return totalSum + nums.length - actualSum;
    }

    public static void main(String[] args) {
        int[] one = new int[]{3, 0, 1};
        int[] two = new int[]{0 , 1};
        int[] three = new int[]{9, 6, 4, 2, 3, 5, 7, 0 ,1};

        System.out.println(missingNumber(one));
        System.out.println(missingNumber(two));
        System.out.println(missingNumber(three));

        System.out.println(missingNumber2(one));
        System.out.println(missingNumber2(two));
        System.out.println(missingNumber2(three));
    }
}
