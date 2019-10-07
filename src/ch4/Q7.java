package ch4;

import java.util.Stack;

public class Q7 {
    public static void main(String[] args) {
        int n1, n2;
        Stack<Integer> stack = new Stack<>();

        stack.push(3); // 피연산자 3 => push
        stack.push(4); // 피연산자 4 => push
        stack.push(5); // 피연산자 5 => push
// 연산자 +
        n2 = stack.pop();
        n1 = stack.pop();
        stack.push(n1 + n2);
// 연산자 *
        n2 = stack.pop();
        n1 = stack.pop();
        stack.push(n1 * n2);

        System.out.println("계산결과 = " + stack.pop());
    }
}
