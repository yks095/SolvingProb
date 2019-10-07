package ch4;

import java.util.Stack;

public class Q11 {
    public static void main(String[] args) {
        String e = "34 12 25/*";
        System.out.println(e);
        System.out.println(postfixEval(e));
    }
    private static double postfixEval(String e) {
        Stack<Double> stack = new Stack<>();

        e = e.replace("+", " +");
        e = e.replace("-", " -");
        e = e.replace("*", " *");
        e = e.replace("/", " /");

        for (String token : e.split("\\s+")) {
            double n1, n2;
            if("+".equals(token))   {
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
                stack.push(Double.valueOf(token));
        }
        return stack.pop();
    }

}
