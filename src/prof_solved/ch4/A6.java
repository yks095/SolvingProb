package prof_solved.ch4;

import java.util.Stack;

public class A6 {
    public static void main(String[] args) {
        String	s="부산({Busan}[(Boo)(saan)])시청({City}{hall}[(See)(Cheong)])"; // true
        System.out.println(checkParen(s));
    }
    private static boolean checkParen(String s) {
        Stack<Character>	stack=new Stack<>();
        for (Character c : s.toCharArray()){
            if(c=='(' || c=='{' || c=='[') stack.push(c);
            if(c==')') if(stack.isEmpty() || stack.pop()!='(') return false;
            if(c=='}') if(stack.isEmpty() || stack.pop()!='{') return false;
            if(c==']') if(stack.isEmpty() || stack.pop()!='[') return false;
        }
        return stack.isEmpty();
    }
}
