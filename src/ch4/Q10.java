package ch4;

import java.util.Stack;

public class Q10 {
    public static void main(String[] args) {
        String e = "3 1 2 / *";
        System.out.println(postfixEval(e));
    }

    private static double postfixEval(String e) {
        Stack<Double> stack = new Stack<>();
        for (String token : e.split("\\s+")) {
            double n1, n2;
            if("+".equals(token))   {   // if("+-*/".contains(token))
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 + n2);
            }
            else if("-".equals(token))  {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 - n2);
            }
            else if("*".equals(token))  {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 * n2);
            }
            else if("/".equals(token))  {
                n2 = stack.pop();
                n1 = stack.pop();
                stack.push(n1 / n2);
            }
            else
                stack.push(Double.parseDouble(token));
        }
        return stack.pop();
    }
}
