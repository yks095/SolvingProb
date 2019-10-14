package ch4;

import java.util.Arrays;
import java.util.Stack;

public class Q19_B {
    public static void main(String[] args) {
        int price[]= {100,90,80,70,85,95,110,120};
        int span[]=new int[price.length];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < price.length; i++)   {
            while (!stack.empty() && price[stack.peek()] <= price[i])
                stack.pop();

            if(stack.empty()) 	{
                span[i] = i+1;
            }
            else if(!stack.empty())	{
                span[i] = i-stack.peek();
            }
            stack.push(i);
        }

        System.out.println(Arrays.toString(span));


    }
}
