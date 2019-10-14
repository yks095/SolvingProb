package ch4;

public class Q17 {
    public static void main(String[] args) {
        SimpleStack_Q17 stack=new SimpleStack_Q17();
        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack); // 스택 출력
        }
        for (int i = 0; i < 10; i++){
            System.out.println("peek : " + stack.peek());
            int data=stack.pop(); // 스택에서 자료 추출
            System.out.println("Data deleted from stack:"+data);
            System.out.println(stack); // 스택 출력
        }
    }
}
