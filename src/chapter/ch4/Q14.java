package chapter.ch4;

public class Q14 {
    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack(3); // 크기 10의 Stack 생성

        // 스택에 5 9 1 순차 삽입
        stack.push(5);
        stack.push(9);
        stack.push(1);
        System.out.println(stack); // 스택 출력

        int peekData = stack.peek();
        int data=stack.pop(); // 스택에서 자료 추출

        System.out.println("Data peeked from stack : " + peekData);
        System.out.println("Data deleted from stack : " + data);
        System.out.println(stack); // 스택 출력

        System.out.println("stack empty test : " + stack.isEmpty());
        System.out.println("stack full test : " + stack.isFull());

    }
}
