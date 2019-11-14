package chapter.ch4;

public class Q13 {
    public static void main(String[] args) {
        String s="대한민국의 수도는 서울이다.";
        char stack[] = new char[s.length()];
        int top = -1;

        for(Character c : s.toCharArray())  {
            stack[++top] = c;
        }

        while(top != -1)  {
            System.out.print(stack[top--]);
        }
    }
}
