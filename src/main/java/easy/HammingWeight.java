package easy;
//#191
public class HammingWeight {
    public static int hammingWeight(int n) {
        int a = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                a += 1;
            }
            n = n >> 1;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
        System.out.println(hammingWeight(2147483645));
    }
}
