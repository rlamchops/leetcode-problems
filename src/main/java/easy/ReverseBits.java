package easy;
//#190

public class ReverseBits {
    public static int reverseBits(int n) {
        int ret = 0;
        for(int a = 0; a < 32; a++) {
            ret <<= 1;
            ret = ret | (n & 1);
            n >>= 1;
        }
        return ret;
    }

    public static void printZeroPaddedInt(int n) {
        String binaryString = Integer.toBinaryString(n);
        while (binaryString.length() < 32) {
            binaryString = "0" + binaryString;
        }
        System.out.println(binaryString);
    }

    public static void main(String[] args) {
        int one = 0b0000_0010_1001_0100_0001_1110_1001_1100;
        printZeroPaddedInt(reverseBits(one));

        int two = 0b1111_1111_1111_1111_1111_1111_1111_1101;
        printZeroPaddedInt(reverseBits(two));
    }
}
