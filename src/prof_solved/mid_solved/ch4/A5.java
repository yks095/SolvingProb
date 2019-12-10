package prof_solved.mid_solved.ch4;

import java.util.Stack;

public class A5 {
    public static void main(String[] args) {
        System.out.println(checkParen("("));
        System.out.println(checkParen(")"));
        System.out.println(checkParen("(()"));
        System.out.println(checkParen("())"));
        System.out.println(checkParen(""));
        System.out.println(checkParen("()"));
        System.out.println(checkParen("(()()()((())))"));
    }
    private static boolean checkParen(String s) {
        Stack<Character> stack=new Stack<>();
        for (Character c : s.toCharArray()) {
            if(c=='(') stack.push(c);
            if(c==')') {
                if(stack.isEmpty()) return false;
                else {
                    if(stack.peek()=='(') stack.pop();
                    else return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
