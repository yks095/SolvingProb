package midTerm;

public class ch1_Q10 {
    public static void main(String[] args) {
        String s1 = "999999999999999999999999999999999999999999999";
        String s2 = "888888888888888888888888888888888888";
        System.out.println(add(s1, s2));
    }

    private static String add(String s1, String s2) {
        String result = "";
        String zero = "";
        int carry = 0;
        int sum = 0;
        int maxLen = s1.length() >= s2.length() ? s1.length() : s2.length();

        for(int i = 0; i < Math.abs(s1.length() - s2.length()); i++)  {
            zero += "0";
        }

        if(s1.length() > s2.length())
            s2 = zero + s2;
        else if(s1.length() < s2.length())
            s1 = zero + s2;

        for(int i = maxLen - 1; i >= 0; i--) {
            sum = (s1.charAt(i) - '0') + (s2.charAt(i) - '0') + carry;

            carry = sum / 10;

            result = (sum % 10) + result;
        }

        if(carry == 1)
            return carry + result;
        else
            return result;
    }
}
