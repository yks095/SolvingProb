package chapter.ch9;

import java.util.TreeSet;

public class Q2 {
    public static void main(String[] args) {
        int n[]={50,20,70,10,30,5,15,25,60,90,62,65,64,35};
        TreeSet<Integer> tree=new TreeSet<>();
        for (int i = 0; i < n.length; i++) tree.add(n[i]); // 이진탐색트리에 자료 삽입
        System.out.println(tree);
        System.out.println(tree.size()); // 트리 내 총 자료 개수 반환
        tree.remove(20); // key 값 20 삭제
        System.out.println(tree);
        System.out.println(tree.contains(30)); // key 값 30이 존재하는 경우 true 반환
        System.out.println(tree.contains(33)); // key 값 33이 존재하지 않는 경우 false 반환
        System.out.println(tree);
    }
}
