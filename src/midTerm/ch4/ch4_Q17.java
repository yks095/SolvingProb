package midTerm.ch4;

public class ch4_Q17 {
    public static void main(String[] args) {
        ch4_Q17_SimpleStack stack=new ch4_Q17_SimpleStack();
        for (int i = 0; i < 10; i++){
            stack.push(i);
            System.out.println(stack); // 스택 출력
        }
        for (int i = 0; i < 10; i++){
            int data=stack.pop(); // 스택에서 자료 추출
            System.out.println("Data deleted from stack:"+data);
            System.out.println(stack); // 스택 출력
        }
    }
}
