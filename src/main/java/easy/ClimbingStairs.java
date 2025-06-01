package easy;
//#70
public class ClimbingStairs {
    public static int climbStairs(int n) {
        if (n <= 2) {
            return n;
        }
        else {
            return climbStairs(n - 1) + climbStairs(n - 2);
        }
    }

//    public static int climbStairsDP(int n) {
//
//    }

    public static void main(String[] args) {
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(5));
    }
}
