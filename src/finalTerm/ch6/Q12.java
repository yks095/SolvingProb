package finalTerm.ch6;

public class Q12 {
    public static void main(String[] args) {
        String s="ABCDEDCBA";
        System.out.println(palindrome(s, 0));
    }

    private static boolean palindrome(String s, int i) {
        int m = s.length() / 2;

        if(i >= m)          // 조건문 확인하기
            return true;

        return s.charAt(i) == s.charAt(s.length() - 1 - i) && palindrome(s, i + 1);
    }
}
