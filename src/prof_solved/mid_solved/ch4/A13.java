package prof_solved.mid_solved.ch4;

public class A13 {
    public static void main(String[] args) {
        String	s="대한민국의 수도는 서울이다.";
        char	stack[] = new char[s.length()];
        int top = -1;
        for (int i = 0; i < s.length(); i++) {
            stack[++top]=s.charAt(i);
        }
        while(top!=-1){
            System.out.print(stack[top--]);
        }
    }
}
