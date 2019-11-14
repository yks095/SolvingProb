package chapter.ch4;

public class Q18 {
    public static void main(String[] args) {
        SimpleStack_18<Integer> stack1=new SimpleStack_18<>();
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        System.out.println(stack1);
        SimpleStack_18<String> stack2=new SimpleStack_18<>();
        stack2.push("K");
        stack2.push("J");
        stack2.push("C");
        System.out.println(stack2);
    }
}
