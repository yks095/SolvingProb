package chapter.ch8;

import java.util.Arrays;

public class Q3_B {
    public static void main(String[] args) {
        int v[]= {2,3,6,8,9};
        Arrays.sort(v); // 배열 정렬
        int key=8;
        int index=binarySearch(v, key, 0, v.length - 1); // 정렬된 배열 내 자료 위치 이진 탐색
        if(index<0) System.out.println("배열 내 자료 없음");
        else System.out.println("자료 발견 위치(배열 내 index): "+index);
    }
    private static int binarySearch(int[] v, int key, int left, int right) {
        int mid = (left + right) / 2;
        if(left > right)
            return -1;
        if(key == v[mid])
            return mid;

        return key < v[mid] ? binarySearch(v, key, left, mid - 1) : binarySearch(v, key, mid + 1, right);
    }
}
