package easy;
//#125
public class ValidPalindrome {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        char[] c = s.toCharArray();
        for(int a = 0; a < c.length/2; a++) {
            char temp = c[a];
            c[a] = c[c.length - 1 - a];
            c[c.length - 1- a] = temp;
        }
        String swapped = new String(c);
        return s.equals(swapped);
    }

    public static void main(String[] args) {
        String one = "A man, a plan, a canal: Panama";
        String two = "race a car";
        String three = " ";

        System.out.println(isPalindrome(one));
        System.out.println(isPalindrome(two));
        System.out.println(isPalindrome(three));
    }
}
