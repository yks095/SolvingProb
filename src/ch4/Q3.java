package ch4;

import java.util.Stack;

public class Q3 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        Stack<Character> stack=new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        while(!stack.isEmpty())
            System.out.print(stack.pop());

    }
}
