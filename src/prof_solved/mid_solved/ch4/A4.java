package prof_solved.mid_solved.ch4;

import java.util.LinkedList;

public class A4 {
    public static void main(String[] args) {
        String	s="대한민국의 수도는 서울이다.";
        LinkedList<Character> stack=new LinkedList<>();
        for (Character c : s.toCharArray()) stack.addFirst(c);
        while(!stack.isEmpty()) System.out.print(stack.removeFirst());
    }
}
