package ch4;

import java.util.Arrays;

public class Q9 {
    public static void main(String[] args) {
        String e = "3 1 2 / *";
        String v[] = e.split("\\s+");
        System.out.println(Arrays.toString(v));
    }
}
