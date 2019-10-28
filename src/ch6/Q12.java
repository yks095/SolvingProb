package ch6;

public class Q12 {
    public static void main(String[] args) {
        String s="ABCDEDCBA";
        System.out.println(palindrome(s, 0));
    }
    private static boolean palindrome(String s, int i) {

        if(i == s.length() / 2)
            return true;

        boolean pal = palindrome(s, i + 1);

        return s.charAt(i) == s.charAt(s.length() - 1 - i) ? pal : false;

    }
}
