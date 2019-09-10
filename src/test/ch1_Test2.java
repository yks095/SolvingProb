package test;

public class ch1_Test2 {
    public static void main(String[] args) {
        String s1="9876543";
        String s2="89";
        char c=s1.charAt(s1.length()-1); // 문자 '3'
        char cc = s2.charAt(s2.length() - 1);
        System.out.println(c);
        System.out.println((int)c); // 문자 '3'에 대응하는 정수
        System.out.println((int)'0'); // 문자 '0'에 대응하는 정수
        int v=c-'0'; // 정수 3 (51-48=3)
        int vv = cc - '0';
        System.out.println(v);
        System.out.println(vv);

        System.out.println("몫 : " + (v+vv)/10);
        System.out.println("나머지 : " + (v+vv)%10);
    }
}
