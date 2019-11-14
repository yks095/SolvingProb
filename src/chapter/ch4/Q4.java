package chapter.ch4;

import java.util.LinkedList;

public class Q4 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        LinkedList<Character> stack=new LinkedList<>();

        for(int i = 0; i < s.length(); i++)    {
            stack.addFirst(s.charAt(i));
        }

        while(!stack.isEmpty())
            System.out.print(stack.removeFirst());
    }
}
