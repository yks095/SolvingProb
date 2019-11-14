package chapter.ch1;

public class Q10 {
    public static void main(String[] args) {
        String s1="999999999999999999999999999999999999999999999";
        String s2="888888888888888888888888888888888888";

        System.out.println(add(s1, s2));
    }

    private static String add(String s1, String s2) {
        String result = "";
        String append = "";

        int sum;
        int carry = 0, val = 0;

        int maxLen = (s1.length() > s2.length()) ? s1.length() : s2.length();

        for(int i = 0; i < Math.abs(s1.length() - s2.length()); i++)  {
            append += "0";
        }

        if(s1.length() > s2.length())
            s2 = append + s2;
        else
            s1 = append + s1;

        for(int i = maxLen - 1; i >= 0; i--)    {
            sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + carry;

            carry = sum / 10;
            val = sum % 10;

            result = val + result;
        }

        if(carry == 1)
            result = carry + result;

        return result;
    }
}
